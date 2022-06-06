package com.bilabonnementjespers.repositorys;

import com.bilabonnementjespers.models.CarModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

@Repository
public class CarRepo {

@Autowired
JdbcTemplate template;

   public List<CarModel> carModelList(){
      String sql = "SELECT * FROM bilabonnement.cars";
      RowMapper<CarModel> rowMapper = new BeanPropertyRowMapper<>(CarModel.class);
      return template.query(sql, rowMapper);
   }
/*
   public void createCar() {
      String sql = "INSERT INTO bilabonnement.cars (" +
              "car_id, brand, model, price) VALUES " +
              "(?,?,?,?);";
      RowMapper<CarModel> rowMapper = new BeanPropertyRowMapper<>(CarModel.class);
      template.update(sql,rowMapper);

   }
   */

}
