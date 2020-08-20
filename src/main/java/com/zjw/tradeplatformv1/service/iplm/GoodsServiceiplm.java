package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.GoodsDao;
import com.zjw.tradeplatformv1.dao.OrderDao;
import com.zjw.tradeplatformv1.pojo.VO.GoodsVO;
import com.zjw.tradeplatformv1.pojo.VO.OneGoodsVO;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order;
import com.zjw.tradeplatformv1.service.GoodsService;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceiplm implements GoodsService {

    @Resource
    GoodsDao goodsDao;
    @Resource
    OrderDao orderDao;

    @Override
    public List<GoodsVO> showByPage(Integer page, Integer type) {
        return goodsDao.selectByPage((page-1)*6,type);/**/
    }

    @Override
    public OneGoodsVO showByOne(Integer goodsID) {
        return goodsDao.selectByPrimaryKey(goodsID);
    }

    @Override
    public Map<String, Object> placeOrderCreate(Order order) {
        Map<String,Object> map = new HashMap<>();

        //处理数据
        Date date = new Date();
        order.setOrderCreateTime(date);
        order.setOrderUpdateTime(date);
        order.setOrderState("待发货");
        order.setOrderVersion(1);

        //插入数据库
        if ( orderDao.insertSelective(order) == 1 ){
            map.put("res",true);
            map.put("msg","插入正常");
        }else {
            map.put("res",false);
            map.put("msg","插入失败");
        }

        return map;
    }

    @Override
    public Map<String, Object> orderSendSet(String state,Integer orderID) {
        Map<String,Object> map = new HashMap<>();

        Order order = new Order();
        order.setOrderState(state);
        order.setOrderId(orderID);

        if(orderDao.updateByPrimaryKeySelective(order) == 1){
            map.put("msg","设置成功");
        }else {
            map.put("msg","设置失败");
        }
        return map;
    }

    @Override
    public Map<String ,Object> showInBuyer(Integer buyerID) {
        return null;
    }

    @Override
    public Map<String ,Object> showInSeller(Integer sellerID) {
        return null;
    }
}
