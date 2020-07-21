package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    GoodsService goodsService;

    /**
     * 商品显示控制器
     * @param page 页数，一页两条数据
     * @return
     */
    @RequestMapping("/showByPage")
    @ResponseBody
    public List<Goods> showByPage(Integer page){
        return goodsService.showByPage(page);
    }


}
