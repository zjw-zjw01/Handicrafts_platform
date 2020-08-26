package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.VO.GoodsItemVO;
import com.zjw.tradeplatformv1.pojo.VO.GoodsSecondVO;
import com.zjw.tradeplatformv1.pojo.VO.GoodsVO;
import com.zjw.tradeplatformv1.pojo.VO.OneGoodsVO;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    OneGoodsVO selectByPrimaryKey(Integer goodsId);

    List<GoodsItemVO> selectByAuthorID(Integer userId);

    List<GoodsVO> selectByPage(Integer page,Integer type);

    GoodsSecondVO selectGoodsNameByGoodsId(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}