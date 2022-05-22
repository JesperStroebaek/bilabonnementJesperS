package com.bilabonnementjespers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "/index";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "/login";
    }
    @PostMapping("/login-submit")
    public String loginSubmit(){
        return "redirect:/main";
    }
    @GetMapping("/main")
    public String mainPage(){
        return "/main";
    }



}
