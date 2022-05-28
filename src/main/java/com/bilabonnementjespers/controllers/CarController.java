package com.bilabonnementjespers.controllers;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String carsMain() {

        return "/cars-main";
    }

    @GetMapping("/car-form")
    public String carForm() {
        return "/car-form";
    }

    @PostMapping("/submit-car-form")
    public String submitCar(@ModelAttribute CarModel c) {

        carService.carModelList();
        return "redirect:/car-list";
    }

    @GetMapping("/car-list")
    public String carList(Model model) {
        List<CarModel> car = new ArrayList<>();
            model.addAttribute("car_id",carModel.getCar_id());
            model.addAttribute("brand",carModel.getBrand());
            model.addAttribute("model",carModel.getModel());
            model.addAttribute("price",carModel.getPrice());
        System.out.println(car);

            return "/car-list";
        }
    }
