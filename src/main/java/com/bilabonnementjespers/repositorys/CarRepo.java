package com.bilabonnementjespers.repositorys;

import com.bilabonnementjespers.models.CarModel;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {




JdbcTemplate template = new JdbcTemplate();

   public List<CarModel> carModelList(){

      String sql = "SELECT * FROM bilabonnement.cars;";
      RowMapper<CarModel> carModelRowMapper = new BeanPropertyRowMapper<>(CarModel.class);
      System.out.println(template.query(sql,carModelRowMapper));
      return template.query(sql,carModelRowMapper);
   }

   public void createCar() {
      String sql = "INSERT INTO bilabonnement.cars (" +
              "car_id, brand, model, price) VALUES " +
              "(?,?,?,?);";
      RowMapper<CarModel> rowMapper = new BeanPropertyRowMapper<>(CarModel.class);
      template.update(sql,rowMapper);

   }
}
