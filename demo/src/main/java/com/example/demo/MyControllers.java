package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControllers {
    @GetMapping("/index.html")
    @ResponseBody
    public String kiir1a() {
        return "index";
    }

}
