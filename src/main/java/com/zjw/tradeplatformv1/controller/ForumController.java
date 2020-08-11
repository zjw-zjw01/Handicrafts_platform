package com.zjw.tradeplatformv1.controller;

import com.zjw.tradeplatformv1.pojo.entity.Comment;
import com.zjw.tradeplatformv1.pojo.entity.Post;
import com.zjw.tradeplatformv1.service.ForumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/forum")
public class ForumController {

    @Resource
    ForumService forumService;

    @RequestMapping("/showPosts")
    @ResponseBody
    public List<Post> showPosts(Integer number){
        return forumService.showPosts(number);
    }

    @ResponseBody
    @RequestMapping("/showOnePost")
    public Map<String,Object> showOnePost(Integer postID){
        return forumService.showOnePost(postID);
    }

    @RequestMapping("/addComment")
    @ResponseBody
    public Map<String,Object> commentAdd(Comment comment){
        return forumService.commentAdd(comment);
    }



}
