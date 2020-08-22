package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.GoodsDao;
import com.zjw.tradeplatformv1.dao.Order1Dao;
import com.zjw.tradeplatformv1.dao.UserDao;
import com.zjw.tradeplatformv1.pojo.VO.GoodsVO;
import com.zjw.tradeplatformv1.pojo.VO.OneGoodsVO;
import com.zjw.tradeplatformv1.pojo.VO.UserVO;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.pojo.entity.Order1;
import com.zjw.tradeplatformv1.pojo.entity.User;
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
    Order1Dao orderDao;
    @Resource
    UserDao userDao;

    @Override
    public List<GoodsVO> showByPage(Integer page, Integer type) {
        return goodsDao.selectByPage((page-1)*6,type);/**/
    }

    @Override
    public OneGoodsVO showByOne(Integer goodsID) {
        return goodsDao.selectByPrimaryKey(goodsID);
    }

    @Override
    public Map<String, Object> placeOrderCreate(Order1 order) {
        Map<String,Object> map = new HashMap<>();

        //处理数据
        Date date = new Date();
        order.setOrder1CreateTime(date);
        order.setOrder1UpdateTime(date);
        order.setOrder1State(1);
        order.setOrder1Version(1);

        System.out.println(order);

        //插入数据库
        User item = userDao.selectByPriKey(order.getOrder1BuyUserId());
        item.setUserBalance(item.getUserBalance()-order.getOrder1PriceSum());
        int t = userDao.updateByPrimaryKeySelective(item);
        int i = orderDao.insertSelective(order);

        if ( i == 1 && t == 1 ){
            map.put("res",true);
            map.put("msg","插入正常");
        }else {
            map.put("res",false);
            map.put("msg","插入失败");
        }

        return map;
    }

    @Override
    public Map<String, Object> orderSendSet(Integer state,Integer orderID) {
        Map<String,Object> map = new HashMap<>();

        Order1 order = new Order1();
        order.setOrder1State(state);
        order.setOrder1Id(orderID);

        if(orderDao.updateByPrimaryKeySelective(order) == 1){
            map.put("res",true);
            map.put("msg","设置成功");
        }else {
            map.put("msg","设置失败");
            map.put("res",false);
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

    @Override
    public Map<String, Object> deleteInSeller(Integer sellerId) {
        Map<String ,Object> map = new HashMap<>();
        if(orderDao.deleteByPrimaryKey(sellerId) == 1){
            map.put("res",true);
            map.put("msg","订单删除成功");
        }else {
            map.put("res",false);
            map.put("msg","删除失败");
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteGoods(Integer goodsId) {
        Map<String ,Object> map = new HashMap<>();
        if(goodsDao.deleteByPrimaryKey(goodsId) == 1){
            map.put("res",true);
            map.put("msg","下架成功");
        }else {
            map.put("res",false);
            map.put("msg","删除失败");
        }
        return map;
    }

}
