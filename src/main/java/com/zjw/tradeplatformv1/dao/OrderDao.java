package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    int deleteByPrimaryKey(Integer orderNumber);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderNumber);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}