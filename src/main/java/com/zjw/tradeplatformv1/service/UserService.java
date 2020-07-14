package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;

public interface UserService {
    boolean loginVerify(UserLoginVO userLoginVO);
}
