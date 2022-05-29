package com.bilabonnementjespers.services;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.repositorys.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
@Service
public class CarService {
    @Autowired
    CarRepo carRepo;

CarModel c = new CarModel();

    public List<CarModel> carModelList()
    {
        return carRepo.carModelList();
    }
    public void createCar(CarModel c){
        carRepo.createCar(c);

    }


}
