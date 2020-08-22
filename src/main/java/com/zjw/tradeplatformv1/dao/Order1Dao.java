package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.VO.Order1VO;
import com.zjw.tradeplatformv1.pojo.entity.Order1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Order1Dao {
    int deleteByPrimaryKey(Integer order1Id);

    int insert(Order1 record);

    int insertSelective(Order1 record);

    Order1 selectByPrimaryKey(Integer order1Id);

    List<Order1VO> selectByUserBuyID(Integer buyerID);

    List<Order1VO> selectByUserSellerID(Integer sellerID);

    int updateByPrimaryKeySelective(Order1 record);

    int updateByPrimaryKey(Order1 record);
}