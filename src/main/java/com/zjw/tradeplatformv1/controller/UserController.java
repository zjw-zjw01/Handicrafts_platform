package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.VO.UserVO;
import com.zjw.tradeplatformv1.pojo.entity.User;
import com.zjw.tradeplatformv1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
@CrossOrigin
public class UserController {
    @Resource
    UserService userService;

    /**
     * 用户登录控制器
     * @param userLoginVO
     * @return Map<String,Object>
     *     res,boolean
     *     msg,String
     *     userID,Integer
     *     userSign,String
     * </String,Object>
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Map<String,Object> login(UserLoginVO userLoginVO){
        return userService.loginVerify(userLoginVO);
    }


    @ResponseBody
    @RequestMapping("/userDetail")
    public UserVO showUserDetail(Integer userId){
        return userService.showOneUser(userId);
    }

}
