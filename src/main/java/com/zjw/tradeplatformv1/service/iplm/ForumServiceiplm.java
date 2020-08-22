package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.CommentDao;
import com.zjw.tradeplatformv1.dao.PostDao;
import com.zjw.tradeplatformv1.pojo.VO.PostArrVO;
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
    public List<PostArrVO> showPosts(Integer number) {
        return postDao.selectByPost((number-1)*6);
    }

    @Override
    public Map<String, Object> showOnePost(Integer postID) {
        Map<String ,Object> map = new HashMap<>();

        map.put("post",postDao.selectByPrimaryKey(postID));
        map.put("comment",commentDao.selectByPostId(postID));
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

    @Override
    public Map<String, Object> addPost(Post post) {
        Map<String ,Object> map = new HashMap<>();
        if (postDao.insertSelective(post) == 1){
            map.put("res",true);
        }else {
            map.put("res",false);
        }
        return map;
    }

    @Override
    public Map<String, Object> deletePost(Integer postId) {
        Map<String ,Object> map = new HashMap<>();
        if(postDao.deleteByPrimaryKey(postId) == 1){
            map.put("res",true);
            map.put("msg","成功删除");
        }else {
            map.put("res",false);
            map.put("msg","删除失败");
        }
        return map;
    }
}
