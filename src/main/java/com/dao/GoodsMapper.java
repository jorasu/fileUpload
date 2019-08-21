package com.dao;

import com.pojo.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GoodsMapper {
    //1.添加一条信息
    int add(Goods goods);

    //2.查询所有订单信息
    List<Map<String,Object>> queryAll();
}
