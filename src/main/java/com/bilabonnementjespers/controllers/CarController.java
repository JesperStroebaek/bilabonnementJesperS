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



    @GetMapping("/car-list") // todo forklar endpoint
    public String carList(org.springframework.ui.Model model) // todo forklar model
    {
        List<CarModel> carModelList = carService.serviceList();
        model.addAttribute("cars", carModelList); // todo forklar
        return "/car-list";
    }

/*
    @PostMapping("/car/car-list")
    public List<CarModel> carForm(
        }
    @GetMapping("/car/car-list")
    public void carList(){
       List<CarModel> carModels = carService.serviceList();
        System.out.println(carModels);
        carService.createCar();
    }
*/
}