package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.entity.Content;
import com.zjw.tradeplatformv1.pojo.entity.Forum;

import java.util.List;

public interface ForumService {
    List<Forum> showAll();
    List<Content> showContent();
}
