package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<Goods> showByPage(Integer page);
    Goods showByOne(Integer goodsID);
    Map<String ,Object> placeOrderService(Order order);
}
