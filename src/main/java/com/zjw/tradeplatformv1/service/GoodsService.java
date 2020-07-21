package com.zjw.tradeplatformv1.service;

import com.zjw.tradeplatformv1.pojo.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> showByPage(Integer page);
}
