package com.bilabonnementjespers.controllers;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {
@Autowired
        CarService carService;
CarModel carModel = new CarModel();

    @GetMapping("/cars-main")
    public String carsMain(){

        return "/cars-main";
    }
    @GetMapping("/car-form")
    public String carForm(){
                return "/car-form";
    }
    @PostMapping("/submit-car-form")
    public String createCar(Model model){
        model.addAttribute("carData", List.of(CarModel.class));
        carService.addNewCar();
        return "redirect:/car-list";
    }
    @GetMapping("/car-list")
    public String carList(Model model){

        return "/car-list";
    }
}
