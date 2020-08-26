package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.VO.UserVO;
import com.zjw.tradeplatformv1.pojo.VO.UserYibanVO;
import com.zjw.tradeplatformv1.pojo.entity.User;
import org.springframework.util.MultiValueMap;

import java.util.Map;

public interface UserService {
    Map<String,Object> loginVerify(UserLoginVO userLoginVO);
    Map<String ,Object> showOneUser(Integer userID);
    UserYibanVO loginYiban(MultiValueMap<String, String> map) throws Exception;
}
