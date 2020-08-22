package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.GoodsVO;
import com.zjw.tradeplatformv1.pojo.VO.OneGoodsVO;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order1;
import org.aspectj.weaver.ast.Or;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<GoodsVO> showByPage(Integer page, Integer type);
    OneGoodsVO showByOne(Integer goodsID);
    Map<String ,Object> placeOrderCreate(Order1 order);
    Map<String,Object> orderSendSet(Integer state,Integer orderID);

    Map<String ,Object> showInBuyer(Integer buyerID);
    Map<String ,Object> showInSeller(Integer SellerID);

    Map<String ,Object> deleteInSeller(Integer sellerId);
    Map<String ,Object> deleteGoods(Integer goodsId);
}
