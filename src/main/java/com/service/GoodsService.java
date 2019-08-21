package com.service;

import com.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    //注册
    boolean register(Goods goods);

    //搜索订单信息
    List<Map<String,Object>> search();
}
