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
    public String carForm()
    {
        return "/car-form";
    }

    @PostMapping("/car-form")
    public String createCar(@ModelAttribute CarModel newCar)
    {
        carService.createCar(newCar);
        return "redirect:/car-list";
    }


    @GetMapping("/search-car-form")
    public String searchForm(Model model)
    {
        model.addAttribute("car", new CarModel());
        return "/search-car-form";
    }

    @GetMapping("/search-car-result")
    public String searchCarResult(@ModelAttribute CarModel carModel, Model model)
    {
        model.addAttribute("cars", carService.searchCar(carModel.getCar_id()));
        return "/search-car-result";
    }
    @GetMapping("/update-car")
    public String updateCar(){
        return "redirect:/car-list";
    }
@GetMapping("/delete-car")
public String deleteCar(int car_id){
        carService.deleteCar(car_id);
        return "/delete-car";

}
}