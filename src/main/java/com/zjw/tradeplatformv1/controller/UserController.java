package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.VO.UserLoginVO;
import com.zjw.tradeplatformv1.pojo.VO.UserVO;
import com.zjw.tradeplatformv1.pojo.VO.UserYibanVO;
import com.zjw.tradeplatformv1.pojo.entity.User;
import com.zjw.tradeplatformv1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
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

    static UserYibanVO user = new UserYibanVO();
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

    /**
     * 前端选择易班登录
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/getYibanUserid")
    public Map<String ,Object> loginByYiban(){
        Map<String ,Object> map = new HashMap<>();
        if (user.getUserid() != null){
            map.put("res",true);
            map.put("YibanUserid",user.getUserid());
        }else {
            map.put("res",false);
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("/loginOut")
    public Map<String ,Object> loginOutByYiban(){
        Map<String ,Object> map = new HashMap<>();
        user.setAccess_token(null);
        user.setExpires(null);
        user.setUserid(null);
        return map;
    }

    /**
     * 回调地址
     * @param
     */
    @RequestMapping("/getCode")
    public String getCode(String code,String access_token,String userid,String expires) throws Exception {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        System.out.println(code);
        map.add("code",code);
        map.add("client_id","d9ad97434d5e9a9b");
        map.add("client_secret","4b6f31ccca67978dbf83ed2b07645758");
        map.add("redirect_uri","http://127.0.0.1:8083/user/getCode");
        if(access_token == null){
            user = userService.loginYiban(map);
        }
        return "redirect:http://127.0.0.1:8083";
    }


    @ResponseBody
    @RequestMapping("/userDetail")
    public Map<String ,Object> showUserDetail(Integer userId){
        return userService.showOneUser(userId);
    }

}
