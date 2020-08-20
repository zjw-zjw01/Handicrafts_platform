package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.VO.SportArrVO;
import com.zjw.tradeplatformv1.pojo.entity.Sport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SportDao {
    int deleteByPrimaryKey(Integer sportId);

    int insert(Sport record);

    int insertSelective(Sport record);

    Sport selectByPrimaryKey(Integer sportId);

    List<SportArrVO> selectByPage(Integer page);

    int updateByPrimaryKeySelective(Sport record);

    int updateByPrimaryKey(Sport record);
}