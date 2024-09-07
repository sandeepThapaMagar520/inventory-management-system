package com.springboot.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.ims.entity.Product;

@Controller
public class ImsController {
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
        System.out.println("this is the adding product");
        return "index";
    }
}
