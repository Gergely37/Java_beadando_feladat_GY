package com.example.feladat01alap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyControllers {
    @GetMapping("/index")
    @ResponseBody
    public String url(){
        return("<h1>Hello world</h1>");
    }
}
