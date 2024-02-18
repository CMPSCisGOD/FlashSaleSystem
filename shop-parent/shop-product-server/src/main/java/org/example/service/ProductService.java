package org.example.service;

import org.example.domain.Product;

public interface ProductService {
    Product findByPid(Long pid);
}
