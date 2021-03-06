package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.VO.GoodsVO;
import com.zjw.tradeplatformv1.pojo.VO.OneGoodsVO;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order1;
import com.zjw.tradeplatformv1.service.GoodsService;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {

    @Resource
    GoodsService goodsService;

    /**
     * 商品显示控制器
     * @param page 页数，一页6条数据
     * @return
     */
    @RequestMapping("/showByPage")
    @ResponseBody
    public List<GoodsVO> showByPage(Integer page, Integer type){
        return goodsService.showByPage(page,type);
    }

    /**
     * 商品详情页显示
     * @param goodsID
     * @return
     */
    @RequestMapping("/showByOne")
    @ResponseBody
    public OneGoodsVO showByGoodsID(Integer goodsID){
        System.out.println(goodsID);
        return goodsService.showByOne(goodsID);
    }


    /**
     *下单
     * @param order
     * @return
     */
    @RequestMapping("/placeOrder")
    @ResponseBody
    public Map<String,Object> placeOrder(Order1 order){
        return goodsService.placeOrderCreate(order);
    }

    /**
     * 发货收货
     * @param state
     * @param orderID
     * @return
     */
    @RequestMapping("/stateChange")
    @ResponseBody
    public Map<String,Object> orderSend(Integer state ,Integer orderID){
        return goodsService.orderSendSet(state,orderID);
    }

    /**
     * 买家显示订单
     * @param buyerID
     * @return
     */
    @ResponseBody
    @RequestMapping("/showInBuyer")
    public Map<String ,Object> orderShowInBuyer(Integer buyerID){
        return goodsService.showInBuyer(buyerID);
    }

    /**
     * 卖家显示订单
     * @param sellerID
     * @return
     */
    @RequestMapping("/showInSeller")
    @ResponseBody
    public Map<String ,Object> orderShowInSeller(Integer sellerID){
        return goodsService.showInSeller(sellerID);
    }

    @ResponseBody
    @RequestMapping("/orderDelete")
    public Map<String ,Object> orderSellerDelete(Integer orderID){
        return goodsService.deleteInSeller(orderID);
    }

    @ResponseBody
    @RequestMapping("/goodsDelete")
    public Map<String ,Object> orderHomeDelete(Integer goodsId){
        return goodsService.deleteGoods(goodsId);
    }

}
