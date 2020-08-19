package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.GoodsVO;
import com.zjw.tradeplatformv1.pojo.VO.OneGoodsVO;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<GoodsVO> showByPage(Integer page, Integer type);
    OneGoodsVO showByOne(Integer goodsID);
    Map<String ,Object> placeOrderCreate(Order order);
    Map<String,Object> orderSendSet(String state,Integer orderID);

    List<Order> showInBuyer(Integer buyerID);
    List<Order> showInSeller(Integer SellerID);
}
