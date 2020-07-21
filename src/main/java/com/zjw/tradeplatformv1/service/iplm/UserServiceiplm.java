package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.UserDao;
import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.entity.User;
import com.zjw.tradeplatformv1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceiplm implements UserService {

    @Resource
    UserDao userDao;

    /**
     * 登录验证
     * @param userLoginVO
     * @return map（res,msg,userID,userSign);
     */
    @Override
    public Map<String,Object> loginVerify(UserLoginVO userLoginVO) {
        Map<String,Object> map = new HashMap<>();

        //验证身份，正确返回用户签名，错误返回提示信息
        User user = userDao.selecrByAccount(userLoginVO.getAccount());
        if(user != null){
            if(user.getUserPassword().equals(userLoginVO.getPassword())){
               map.put("res",true);
               map.put("msg","登录成功");
               map.put("userID",user.getUserId());
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
