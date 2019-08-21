package com.service.impl;

import com.dao.GoodsMapper;
import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public boolean register(Goods goods) {
        if(goodsMapper.add(goods)>0){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public List<Map<String, Object>> search() {
        return goodsMapper.queryAll();
    }
}
