package com.example.leet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/Root")
    public String root() {
        
        
        return "Top";
    }
}
