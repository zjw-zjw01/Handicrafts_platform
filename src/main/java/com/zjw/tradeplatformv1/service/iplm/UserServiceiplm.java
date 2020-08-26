package com.zjw.tradeplatformv1.service.iplm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParser;
import com.zjw.tradeplatformv1.dao.GoodsDao;
import com.zjw.tradeplatformv1.dao.Order1Dao;
import com.zjw.tradeplatformv1.dao.PostDao;
import com.zjw.tradeplatformv1.dao.UserDao;
import com.zjw.tradeplatformv1.pojo.VO.Order1VO;
import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.VO.UserVO;
import com.zjw.tradeplatformv1.pojo.VO.UserYibanVO;
import com.zjw.tradeplatformv1.pojo.entity.User;
import com.zjw.tradeplatformv1.service.UserService;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;



@Service
public class UserServiceiplm implements UserService {

    /**
     * 忽略https安全校验
     */
    HostnameVerifier hv = new HostnameVerifier() {
        public boolean verify(String urlHostName, SSLSession session) {
            System.out.println("Warning: URL Host: " + urlHostName + " vs. "
                    + session.getPeerHost());
            return true;
        }
    };

    private static void trustAllHttpsCertificates() throws Exception {
        javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
        javax.net.ssl.TrustManager tm = new miTM();
        trustAllCerts[0] = tm;
        javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
                .getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
                .getSocketFactory());
    }

    static class miTM implements javax.net.ssl.TrustManager,
            javax.net.ssl.X509TrustManager {
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public boolean isServerTrusted(
                java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public boolean isClientTrusted(
                java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public void checkServerTrusted(
                java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }

        public void checkClientTrusted(
                java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }
    }
////////////////////////////////////////////////////////////////////
    @Resource
    UserDao userDao;
    @Resource
    GoodsDao goodsDao;
    @Resource
    Order1Dao order1Dao;
    @Resource
    PostDao postDao;

    /**
     * 登录验证（多线程）
     * @param userLoginVO
     * @return map（res,msg,userID,userSign,userName);
     */
    @Override
    public Map<String,Object> loginVerify(UserLoginVO userLoginVO) {
        //多线程实现
        Map<String, Object> map = new HashMap<>();

        //创建并启动线程
        FutureTask<Map<String ,Object>> task = new FutureTask<>(new MyCallable(userLoginVO));
        Thread thread = new Thread(task, "1");
        thread.start();

        //获取线程返回值
        try {
            map = task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * user模块展示
     * @param userID
     * @return
     */
    @Override
    public Map<String,Object> showOneUser(Integer userID) {
        Map<String ,Object> map = new HashMap<>();
        List<Order1VO> list1 = order1Dao.selectByUserBuyID(userID);
        List<Order1VO> list2 = order1Dao.selectByUserSellerID(userID);

        for (Order1VO item :list1){
            item.setGoodsName(goodsDao.selectGoodsNameByGoodsId(item.getOrder1GoodsId()).getGoodsName());
            item.setGoodsImage(goodsDao.selectGoodsNameByGoodsId(item.getOrder1GoodsId()).getGoodsImage());
        }

        for (Order1VO item :list2){
            item.setGoodsName(goodsDao.selectGoodsNameByGoodsId(item.getOrder1GoodsId()).getGoodsName());
            item.setGoodsImage(goodsDao.selectGoodsNameByGoodsId(item.getOrder1GoodsId()).getGoodsImage());
        }

        map.put("user",userDao.selectByPrimaryKey(userID));
        map.put("myGoods",goodsDao.selectByAuthorID(userID));
        map.put("orderBuyer",list1);
        map.put("orderSeller",list2);
        map.put("post",postDao.selectByAuthorID(userID));

        return map;
    }

    /***
     * 易班登录
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public UserYibanVO loginYiban(MultiValueMap<String, String> map) throws Exception {
        trustAllHttpsCertificates();
        HttpsURLConnection.setDefaultHostnameVerifier(hv);

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://openapi.yiban.cn/oauth/access_token";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity(map, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, request,String.class);
        System.out.println(response.getBody());

        UserYibanVO user = JSONObject.parseObject(response.getBody(),UserYibanVO.class);

        System.out.println(user);

        return user;
    }

    /**
     * 多线程对象
     */
    public class MyCallable implements Callable<Map<String,Object>>{

        private UserLoginVO userLoginVO;

        public MyCallable(UserLoginVO userLoginVO) {
            this.userLoginVO = userLoginVO;
        }

        @Override
        public Map<String, Object> call() throws Exception {
            Map<String,Object> map = new HashMap<>();
            //验证身份，正确返回用户签名，错误返回提示信息
            User user = userDao.selecrByAccount(userLoginVO.getAccount());
            if(user != null){
                if(user.getUserPassword().equals(userLoginVO.getPassword())){
                    map.put("res",true);
                    map.put("msg","登录成功");
                    map.put("userID",user.getUserId());
                    map.put("userName",user.getUserName());
                    map.put("userSign",user.getUserSign());
                }else {
                    map.put("res",false);
                    map.put("msg","登录失败");
                }
            }else {
                map.put("res",false);
                map.put("msg","登录失败");
            }
            return map;
        }




    }
}
