package com.springboot.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ims.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
