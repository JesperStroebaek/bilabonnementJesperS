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
    @PostMapping("/submit-login")
    public String submitLogin(String username, String password){
        return "redirect:/main-page";
    }
    @GetMapping("/main-page")
    public String mainPage(){
        return "/main-page";
    }
    @GetMapping("/reg-main")
    public String registrationMain(){
        return "/reg-main";
    }

    @GetMapping("/customer-main")
    public String customerMain(){
        return "/customer-main";
    }



}
