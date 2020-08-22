package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.VO.PostArrVO;
import com.zjw.tradeplatformv1.pojo.VO.PostVO;
import com.zjw.tradeplatformv1.pojo.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostDao {
    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    int insertSelective(Post record);

    PostVO selectByPrimaryKey(Integer postid);

    List<PostVO> selectByAuthorID(Integer userId);

    List<PostArrVO> selectByPost(Integer number);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}