package com.springboot.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImsContoller {
    @GetMapping("/")
    public String home(){
        return "index.html";
    }

}
