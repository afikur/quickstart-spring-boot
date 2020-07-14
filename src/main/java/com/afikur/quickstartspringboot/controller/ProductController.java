package com.afikur.quickstartspringboot.controller;

import com.afikur.quickstartspringboot.model.Product;
import com.afikur.quickstartspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(@RequestParam(name = "type", required = false) String type,
                                        @RequestParam(name = "min_price", required = false) BigDecimal min_price,
                                        @RequestParam(name = "max_price", required = false) BigDecimal max_price,
                                        @RequestParam(name = "city", required = false) String city,
                                        @RequestParam(name = "properties", required = false) String properties) {
        return productService.findAllProducts(type, min_price, max_price, city, properties);
    }

}
