package com.bilabonnementjespers.controllers;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;
    @Autowired


    @GetMapping("/car-form")
    public String carForm() {
        return "/car-form";
    }
    /*
    @GetMapping("submit-car-form")
    public String carList2(Model model){
    List<CarModel> carModels = carService.serviceList();
        model.addAttribute("cars",carModels);
        System.out.println(carModels);
        return "/car-list";
    }*/

    @PostMapping("/submit-car-form")
    @ResponseBody
    public String carForm(@RequestParam(value = "car_id") String car_id
            , @RequestParam(value = "brand") String brand
            , @RequestParam(value = "model") String model
            , @RequestParam(value = "price") String price) {
        System.out.println(car_id+brand+price+model);
        return "/car-list";
    }
    @GetMapping("/car-list")
    public void carList(){
       List<CarModel> carModels = carService.serviceList();
        System.out.println(carModels);
        carService.createCar();

    }
}