package com.bilabonnementjespers.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ReturnTestController {


@org.springframework.web.bind.annotation.GetMapping
    public String testForm("/test-form"){
        return "/test-form";
}
@org.springframework.web.bind.annotation.PostMapping
    public String(@org.springframework.web.bind.annotation.ModelAttribute TestModel,){
        return "redirect:/test-result";
}
}
