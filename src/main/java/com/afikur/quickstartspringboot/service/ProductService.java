package com.afikur.quickstartspringboot.service;

import com.afikur.quickstartspringboot.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
}
