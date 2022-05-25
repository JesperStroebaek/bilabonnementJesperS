package com.bilabonnementjespers.repositorys;

import com.bilabonnementjespers.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepo {

@Autowired
JdbcTemplate template;

@Autowired
CarModel carModel;
   public List<CarModel> carModelList(){
      RowMapper<CarModel> carModelRowMapper = new BeanPropertyRowMapper<>(CarModel.class);
      String sql = "INSERT INTO bilabonnement.cars (car_id,brand,model,price) VALUES (?,?,?,?);";
      template.query(sql, carModelRowMapper);
      return carModelList();

   }

//update(sql, carModel.getCar_id(), carModel.getBrand(), carModel.getModel(), carModel.getPrice());
}
