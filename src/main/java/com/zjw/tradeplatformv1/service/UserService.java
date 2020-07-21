package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;

import java.util.Map;

public interface UserService {
    Map<String,Object> loginVerify(UserLoginVO userLoginVO);
}
