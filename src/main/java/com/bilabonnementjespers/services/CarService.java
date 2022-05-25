package com.bilabonnementjespers.services;

import com.bilabonnementjespers.models.CarModel;
import com.bilabonnementjespers.repositorys.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {
    @Autowired
    CarRepo carRepo;

    public List<CarModel> carList(){
        carRepo.carModelList();

        System.out.println(carList());
        return carList();
    }

}
