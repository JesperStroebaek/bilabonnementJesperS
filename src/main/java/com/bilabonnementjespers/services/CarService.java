package com.bilabonnementjespers.services;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.repositorys.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {
    @Autowired
    CarRepo carRepo;



    public List<CarModel> serviceList()
    {
        return carRepo.carModelList();
    }

    public void createCar(CarModel newCar){

        carRepo.createCar(newCar);
    }

    public CarModel searchCar(int car_id){

        return carRepo.searchCar(car_id);
    }
    public void deleteCar(int car_id){
        carRepo.deleteCar(car_id);
    }
    public void updateCar(int car_id, CarModel c){
        carRepo.updateCar(car_id,c);
    }

}


