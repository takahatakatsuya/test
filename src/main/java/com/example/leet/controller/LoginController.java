package com.example.leet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    //初期表示
    @GetMapping("/")
    public String LoginGet(Model model) throws Exception {

        return "Login";
    }

    //トップページに遷移
    @PostMapping(value = "/LoginAction", params = "loginBtn")
    public String LoginPost(Model model,RedirectAttributes redirectAttributes) throws Exception {

      

        return "redirect:/Root";    
    }
}
