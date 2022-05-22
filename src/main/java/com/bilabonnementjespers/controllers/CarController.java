package com.bilabonnementjespers.controllers;

import com.bilabonnementjespers.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarModel carModel = new CarModel(12,"mercer");

    @GetMapping("/cars-main")
    public String carsMain(){
        return "/cars-main";
    }
    @GetMapping("/create-car")
    public String createCar(){
        return "/create-car";
    }
    @PostMapping("/create-car-submit")
    public List<CarModel> carModelList(Model model){
        model.addAttribute("car_id",CarModel.class);
        System.out.printf(carModelList(new CarModel()));
    return carModelList(model);
    }


}
