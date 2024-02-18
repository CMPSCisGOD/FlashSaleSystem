package org.example.controller;

import org.example.impl.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SentinelController {
    @RequestMapping("/sentinel1")
    public String sentinel1() {
    //模拟一次网络延时
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        return "sentinel1";
}

    @RequestMapping("/sentinel2")
    public String sentinel2(){
        return "测试高并发下的问题";
    }

    @RequestMapping("/sentinel3")
    public String sentinel3(){
        return "sentinel3";
    }

    @Autowired
    private GoodService goodService;
    @RequestMapping("/queryOrder")
    public String queryOrder(){
        goodService.querygood();
        return "查询商品功能";
    }

    @RequestMapping("/createOrder")
    public String createOrder(){
        goodService.querygood();
        return "创建订单功能";
    }
}
