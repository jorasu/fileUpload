package com.test;

import com.pojo.Goods;
import com.service.GoodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        GoodsService goodsService= (GoodsService) ac.getBean("goodsServiceImpl");
        Goods goods=new Goods(
                "2",1,1,1,1,"2012-02-15","1");
        System.out.println(goodsService.register(goods));
    }
}
