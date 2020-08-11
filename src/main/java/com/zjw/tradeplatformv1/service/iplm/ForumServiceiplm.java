package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.CommentDao;
import com.zjw.tradeplatformv1.dao.PostDao;
import com.zjw.tradeplatformv1.pojo.entity.Comment;
import com.zjw.tradeplatformv1.pojo.entity.Post;
import com.zjw.tradeplatformv1.service.ForumService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ForumServiceiplm implements ForumService {

    @Resource
    PostDao postDao;
    @Resource
    CommentDao commentDao;

    @Override
    public List<Post> showPosts(Integer number) {
        return postDao.selectByPost(number);
    }

    @Override
    public Map<String, Object> showOnePost(Integer postID) {
        Map<String ,Object> map = new HashMap<>();

        map.put("post",postDao.selectByPrimaryKey(postID));
        map.put("comment",commentDao.selectByPrimaryKey(postID));
        return map;
    }

    @Override
    public Map<String, Object> commentAdd(Comment comment) {
        Map<String,Object> map = new HashMap<>();
        if(commentDao.insertSelective(comment) == 1){
            map.put("msg","插入成功");
        }else {
            map.put("msg","插入失败");
        }
        return map;
    }
}
