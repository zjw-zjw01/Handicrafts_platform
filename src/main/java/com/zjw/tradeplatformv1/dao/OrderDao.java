package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    int deleteByPrimaryKey(Integer orderNumber);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderNumber);

    List<Order> selectByBuyerID(Integer buyID);

    List<Order> selectBySellerID(Integer sellerID);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}