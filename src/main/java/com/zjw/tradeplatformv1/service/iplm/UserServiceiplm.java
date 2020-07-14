package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.UserDao;
import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.entity.User;
import com.zjw.tradeplatformv1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceiplm implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public boolean loginVerify(UserLoginVO userLoginVO) {
        boolean result = false;
        User user = userDao.selectByUserAccount(userLoginVO.getAccount());
        if(user != null){
            if(user.getUserPassword().equals(userLoginVO.getPassword())){
                result = true;
            }
        }
        return result;
    }
}
