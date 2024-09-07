package com.springboot.ims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ims.entity.Product;
import com.springboot.ims.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    
    public void addProduct(Product product) {
        productRepository.save(product);
    }

}
