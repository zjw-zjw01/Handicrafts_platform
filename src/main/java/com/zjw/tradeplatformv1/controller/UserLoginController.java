package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
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
public class UserLoginController {
    @Resource
    UserService userService;

    /**
     * 用户登录控制器
     * @param userLoginVO
     * @return Map<String,Object>
     *     res,boolean
     *     msg,String
     * </String,Object>
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Map<String,Object> login(UserLoginVO userLoginVO){
        Map<String,Object> map = new HashMap<String, Object>();
        if(userService.loginVerify(userLoginVO)){
            map.put("res",true);
            map.put("msg","登录成功！");
        }else {
            map.put("res",false);
            map.put("msg","登录失败！");
        }
        return map;

    }

}
