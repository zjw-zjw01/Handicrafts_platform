package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.GoodsDao;
import com.zjw.tradeplatformv1.dao.OrderDao;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order;
import com.zjw.tradeplatformv1.service.GoodsService;
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
    public List<Goods> showByPage(Integer page) {
        return goodsDao.selectByPage((page-1)*2);
    }

    @Override
    public Goods showByOne(Integer goodsID) {
        return goodsDao.selectByPrimaryKey(goodsID);
    }

    @Override
    public Map<String, Object> placeOrderService(Order order) {
        Map<String,Object> map = new HashMap<>();

        //处理数据
        Date date = new Date();
        order.setCreateTime(date);
        order.setUpdateTime(date);
        order.setVersion(1);

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
}
