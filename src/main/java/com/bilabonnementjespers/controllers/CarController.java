package com.bilabonnementjespers.controllers;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/car-list") // todo forklar endpoint - Getmetode til at få fat i mappingen til carlisten
    public String carList(Model model) // todo forklar model - et interface fra springframework.
    {
        List<CarModel> carModelList = carService.serviceList();
        model.addAttribute("cars", carModelList); // todo forklar
        return "/car-list";
    }


    @GetMapping("/car-form")
    public String carForm(){
        return "/car-form";
        }
    @PostMapping("/car-form")
    public String createCar(@ModelAttribute CarModel newCar){
        carService.createCar(newCar);
        return "redirect:/car-list";
    }
    @GetMapping("/search-car-form")
    public String searchCar(){
        return "/search-car-form";
    }
}