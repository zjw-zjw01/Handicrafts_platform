package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.ContentDao;
import com.zjw.tradeplatformv1.dao.ForumDao;
import com.zjw.tradeplatformv1.pojo.entity.Content;
import com.zjw.tradeplatformv1.pojo.entity.Forum;
import com.zjw.tradeplatformv1.service.ForumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForumServiceiplm implements ForumService {
    @Resource
    ForumDao forumDao;
    @Resource
    ContentDao contentDao;

    @Override
    public List<Forum> showAll(){
        return forumDao.selectAll();
    }

    @Override
    public List<Content> showContent() {
        return contentDao.selectAll();
    }


}
