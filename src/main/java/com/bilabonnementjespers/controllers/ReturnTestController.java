package com.bilabonnementjespers.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ReturnTestController {
@org.springframework.beans.factory.annotation.Autowired
    com.bilabonnementjespers.services.ReturnTestService returnTestService;

@org.springframework.web.bind.annotation.GetMapping("/test-form")
    public String testForm(){
        return "/test-form";
}
@org.springframework.web.bind.annotation.PostMapping("/test-form")
    public String createReturnTest(@org.springframework.web.bind.annotation.ModelAttribute com.bilabonnementjespers.models.ReturnTestModel newTest)
{
    returnTestService.createReturnTest();
    return "redirect:/test-result";
}
}
