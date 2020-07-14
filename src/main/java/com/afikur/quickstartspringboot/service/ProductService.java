package com.afikur.quickstartspringboot.service;

import com.afikur.quickstartspringboot.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    List<Product> findAllProducts(String type, BigDecimal min_price, BigDecimal max_price, String city, String properties);
}
