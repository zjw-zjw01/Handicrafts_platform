package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.VO.PostArrVO;
import com.zjw.tradeplatformv1.pojo.entity.Comment;
import com.zjw.tradeplatformv1.pojo.entity.Post;
import com.zjw.tradeplatformv1.service.ForumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/forum")
@CrossOrigin
public class ForumController {

    @Resource
    ForumService forumService;

    @RequestMapping("/showPosts")
    @ResponseBody
    public List<PostArrVO> showPosts(Integer number){
        return forumService.showPosts(number);
    }

    @ResponseBody
    @RequestMapping("/showOnePost")
    public Map<String,Object> showOnePost(Integer postID){
        return forumService.showOnePost(postID);
    }

    @RequestMapping("/addPost")
    @ResponseBody
    public Map<String ,Object> addPost(Post post){
        return forumService.addPost(post);
    }

    @RequestMapping("/addComment")
    @ResponseBody
    public Map<String,Object> commentAdd(Comment comment){
        return forumService.commentAdd(comment);
    }

    @RequestMapping("/deletePost")
    @ResponseBody
    public Map<String ,Object> deletePost(Integer postId){
        return forumService.deletePost(postId);
    }

}
