package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.SportDao;
import com.zjw.tradeplatformv1.pojo.VO.SportArrVO;
import com.zjw.tradeplatformv1.pojo.entity.Sport;
import com.zjw.tradeplatformv1.service.SportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SportServiceiplm implements SportService {

    @Resource
    SportDao sportDao;

    @Override
    public List<SportArrVO> showSports(Integer page) {
        return sportDao.selectByPage( (page-1)*3 );
    }

    @Override
    public Sport showOneSport(Integer sportID) {
        return sportDao.selectByPrimaryKey(sportID);
    }
}
