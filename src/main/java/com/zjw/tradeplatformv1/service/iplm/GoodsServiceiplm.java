package com.zjw.tradeplatformv1.service.iplm;

import com.zjw.tradeplatformv1.dao.GoodsDao;
import com.zjw.tradeplatformv1.pojo.entity.Goods;
import com.zjw.tradeplatformv1.service.GoodsService;

import javax.annotation.Resource;
import java.util.List;

public class GoodsServiceiplm implements GoodsService {

    @Resource
    GoodsDao goodsDao;

    @Override
    public List<Goods> showByPage(Integer page) {
        return goodsDao.selectByPage((page-1)*2);
    }
}
