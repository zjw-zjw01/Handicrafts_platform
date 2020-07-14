package com.zjw.tradeplatformv1.controller;


import com.zjw.tradeplatformv1.pojo.entity.Content;
import com.zjw.tradeplatformv1.pojo.entity.Forum;
import com.zjw.tradeplatformv1.service.ForumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/forum")
public class ForumShowController {

    @Resource
    ForumService forumService;

    @RequestMapping("/showForum")
    @ResponseBody
    public List<Forum> showForums(){
        return forumService.showAll();
    }

    @RequestMapping("/showContent")
    @ResponseBody
    public List<Content> showContents(){
        return forumService.showContent();
    }


}
