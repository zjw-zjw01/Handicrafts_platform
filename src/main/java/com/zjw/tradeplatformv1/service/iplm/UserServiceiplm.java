package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.UserDao;
import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.VO.UserVO;
import com.zjw.tradeplatformv1.pojo.entity.User;
import com.zjw.tradeplatformv1.service.UserService;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Service
public class UserServiceiplm implements UserService {

    @Resource
    UserDao userDao;

    /**
     * 登录验证
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


        /*  单线程实现
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
        return map;*/
    }

    @Override
    public UserVO showOneUser(Integer userID) {
        return userDao.selectByPrimaryKey(userID);
    }

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
