package com.springboot.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.ims.entity.Product;
import com.springboot.ims.service.ProductService;

@Controller
public class ImsController {
    @Autowired
    private ProductService productService;


    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/add")
    public String addProduct(){
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product){

        productService.addProduct(product);
        return "redirect:/";
    }
}
