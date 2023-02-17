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
    private CarService carService;


    @GetMapping("/car-list")
    public String carList(Model model)
    {
        List<CarModel> carModelList = carService.serviceList();
        model.addAttribute("cars", carModelList);
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
    public String searchForm(Model model){
        model.addAttribute("car", new CarModel());
        return "/search-car-form";
    }

    @GetMapping("/search-car-result")
    public String searchCarResult(@ModelAttribute CarModel carModel, Model model){
        System.out.println("test");
        model.addAttribute("cars", carService.searchCar(carModel.getCar_id()));
        return "/search-car-result";
    }
    @GetMapping("/delete-car/{car_id}")
    public String deleteCar(@PathVariable("carId") int car_id){
        Boolean deleted = carService.deleteCar(car_id);


        //todo spørg jeff
        if (deleted){
            return "redirect:/";
        }else {
            return "redirect:/";
        }
    }

}