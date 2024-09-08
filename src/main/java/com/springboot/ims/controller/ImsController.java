package com.springboot.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.ims.entity.Product;
import com.springboot.ims.service.ProductService;

@Controller
public class ImsController {
    @Autowired
    private ProductService productService;


    @GetMapping("/")
    public String index(Model model ){

        List<Product> allProduct = productService.getAllProduct();
        
        model.addAttribute("allProduct", allProduct);
        return "index";
    }
    @GetMapping("/add")
    public String addProduct(){
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){

        productService.addProduct(product);
        redirectAttributes.addFlashAttribute("successMessage", "Product added successfully!");
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, Model model){
        
        Product productById = productService.getProductById(id);

        model.addAttribute("product", productById);
        return "editProduct";

    }
}
