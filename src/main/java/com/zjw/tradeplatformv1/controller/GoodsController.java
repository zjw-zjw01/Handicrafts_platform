package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order;
import com.zjw.tradeplatformv1.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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

    /**
     * 商品详情页显示
     * @param goodsID
     * @return
     */
    @RequestMapping("/showByOne")
    @ResponseBody
    public Goods showByGoodsID(Integer goodsID){
        return goodsService.showByOne(goodsID);
    }


    /**
     *下单
     * @param order
     * @return
     */
    @RequestMapping("/placeOrder")
    @ResponseBody
    public Map<String,Object> placeOrder(Order order){
        return goodsService.placeOrderService(order);
    }


}
