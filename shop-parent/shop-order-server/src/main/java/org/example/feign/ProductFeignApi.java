package org.example.feign;

import org.example.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="product-Service",path="/product")
public interface ProductFeignApi {
    @RequestMapping("/get")
    Product get(@RequestParam("pid") Long pid);
}
