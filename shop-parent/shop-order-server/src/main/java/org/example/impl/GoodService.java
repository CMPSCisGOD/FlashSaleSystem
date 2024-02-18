package org.example.impl;

import org.springframework.stereotype.Service;

@Service
public class GoodService {
    @SentinelResource("queryGood")
    public void querygood(){
        System.out.println("正在查询商品");
    }
}
