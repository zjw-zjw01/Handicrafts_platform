package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.VO.UserVO;
import com.zjw.tradeplatformv1.pojo.entity.User;

import java.util.Map;

public interface UserService {
    Map<String,Object> loginVerify(UserLoginVO userLoginVO);
    Map<String ,Object> showOneUser(Integer userID);
}
