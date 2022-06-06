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



    @GetMapping("/car-form")
    public String carForm() {
        return "/car-form";
    }
    CarModel carModel = new com.bilabonnementjespers.models.CarModel();
    @PostMapping("/car-form")
    @ResponseBody
    public List<CarModel> carForm(
            @RequestParam(value = "brand") String brand
            , @RequestParam(value = "model") String model
            , @RequestParam(value = "price") int price) {
        System.out.println(brand+price+model);
        String fraCarForm = (carModel.getCar_id()+carModel.getBrand()+carModel.getModel());
        return fraCarForm;
    }
    @GetMapping("/car-list")
    public void carList(){
       List<CarModel> carModels = carService.serviceList();
        System.out.println(carModels);
        carService.createCar();
    }

}