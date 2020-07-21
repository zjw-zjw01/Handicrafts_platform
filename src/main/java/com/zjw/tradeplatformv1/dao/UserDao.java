package com.zjw.tradeplatformv1.dao;

import com.zjw.tradeplatformv1.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selecrByAccount(String account);

    List<User> selectByPage(Integer pageIndex);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}