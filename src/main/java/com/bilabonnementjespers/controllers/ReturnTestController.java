package com.bilabonnementjespers.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ReturnTestController {


@org.springframework.web.bind.annotation.GetMapping
    public String testForm("/test-form"){
        return "/test-form";
}
@org.springframework.web.bind.annotation.PostMapping
    public String createReturnTest(@org.springframework.web.bind.annotation.ModelAttribute com.bilabonnementjespers.models.ReturnTestModel newTest)
{
    com.bilabonnementjespers.services.ReturnTestService returnTestService;
    return "redirect:/test-result";
}
}
