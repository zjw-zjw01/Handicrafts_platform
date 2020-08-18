package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.VO.GoodsVO;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    List<GoodsVO> selectByPage(Integer page,Integer type);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}