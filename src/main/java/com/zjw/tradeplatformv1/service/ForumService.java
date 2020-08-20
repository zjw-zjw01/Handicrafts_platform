package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.PostArrVO;
import com.zjw.tradeplatformv1.pojo.entity.Comment;
import com.zjw.tradeplatformv1.pojo.entity.Post;

import java.util.List;
import java.util.Map;

public interface ForumService {
    List<PostArrVO> showPosts(Integer number);
    Map<String ,Object> showOnePost(Integer postID);
    Map<String,Object> commentAdd(Comment comment);
}
