package com.springboot.ims.service;

import java.util.List;
import java.util.Optional;

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

    public List<Product> getAllProduct(){
        return productRepository.findAll();

    }

    public Product getProductById(int id){
        Optional<Product> productById=  productRepository.findById(id);
        if(productById.isPresent()){
            return productById.get();
        }
        return null;
    }

}
