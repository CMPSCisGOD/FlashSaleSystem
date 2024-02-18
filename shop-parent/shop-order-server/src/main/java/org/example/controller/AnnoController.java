package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AnnoController {
    @RequestMapping("/anno1")
    @SentinelResource(value = "anno1", blockHandler="anno1BlockHandler", fallback = "anno1Fallback")
    public String anno1(String name){
        if("wolfcode".equals(name)){
            throw new RuntimeException();
        }
        return "anno1";
    }
    public String anno1BlockHandler(String name, BlockException ex){
        log.error("{}", ex);
        return "接口被限流或者降级了";
    }
    //Throwable时进入的方法
    public String anno1Fallback(String name,Throwable throwable) {
        log.error("{}", throwable);
        return "接口发生异常了";
    }
}
