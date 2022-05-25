package com.bilabonnementjespers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DamageController {

@GetMapping("/damage-main")
public String damageMain(){
    return "/damage-main";
}

}
