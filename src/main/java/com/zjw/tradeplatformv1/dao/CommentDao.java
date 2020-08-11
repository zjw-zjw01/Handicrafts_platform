package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDao {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}