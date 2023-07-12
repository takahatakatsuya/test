package com.example.leet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

    @GetMapping("/BooksInfo")
    public String root() {
        
        
        return "Books";
    }
}
