package org.example.feign;

import org.example.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignFallBack implements ProductFeignApi {

    @Override
    public Product get(Long pid) {
        Product product = new Product(); product.setPid(-1L); product.setPname("兜底数据"); product.setPprice(0.0);
        return product;
    }
}