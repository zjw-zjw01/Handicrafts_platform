package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.VO.SportArrVO;
import com.zjw.tradeplatformv1.pojo.entity.Sport;

import java.util.List;

public interface SportService {

    List<SportArrVO> showSports(Integer page);
    Sport showOneSport(Integer sportID);

}
