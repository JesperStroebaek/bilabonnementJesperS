package com.bilabonnementjespers.controllers;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
@Autowired
CarService carService;
@Autowired
CarModel carModel;

    @GetMapping("/cars-main")
    public String carsMain(){

        return "/cars-main";
    }
    @GetMapping("/car-form")
    public String carForm(){
                return "/car-form";
    }
    @PostMapping("/submit-car-form")
    public String submitCar(Model model){
       model.addAttribute(carModel.getCar_id());
        model.addAttribute(carModel.getBrand());
        model.addAttribute(carModel.getModel());
        model.addAttribute(carModel.getPrice());
        System.out.println(carModel.getCar_id() + carModel.getBrand());
        return "/car-list";
    }
    @GetMapping("/car-list")
    public String renderCarList(Model model){
        model.addAttribute(carModel);
        System.out.println(carModel);
        return "/car-list";
    }
}
