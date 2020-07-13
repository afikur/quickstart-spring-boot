package com.afikur.quickstartspringboot.repository;

import com.afikur.quickstartspringboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
