package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostDao {
    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer postid);

    List<Post> selectByPost(Integer number);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}