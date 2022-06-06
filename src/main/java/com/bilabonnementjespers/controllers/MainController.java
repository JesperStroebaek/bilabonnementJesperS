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
    public String loginPage() {
        return "/login";
    }
    @PostMapping("/main-page")
    public String mainPage(){
        return "/main-page";
    }
    @GetMapping("/main-page")
    public String getMainPage(){
        return "/main-page";
    }
    @GetMapping("/reg-main")
    public String registrationMain(){
        return "/reg-main";
    }
    @GetMapping("/damage-main")
    public String damageMain(){
        return "/damage-main";
    }
    @GetMapping("/business-dev-main")
    public String businessMain(){
        return "/business-dev-main";
    }


}
