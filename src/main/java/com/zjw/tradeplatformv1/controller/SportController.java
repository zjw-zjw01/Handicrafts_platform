package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.entity.Sport;
import com.zjw.tradeplatformv1.service.SportService;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sport")
public class SportController {

    @Resource
    SportService sportService;

    @ResponseBody
    @RequestMapping("/showAll")
    public List<Sport> showByPage(Integer page){
        return sportService.showSports(page);
    }

    @RequestMapping("/showOne")
    @ResponseBody
    public Sport showOneSport(Integer sportID){
        return sportService.showOneSport(sportID);
    }


}
