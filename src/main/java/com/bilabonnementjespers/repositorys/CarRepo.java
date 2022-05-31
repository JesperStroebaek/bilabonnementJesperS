package com.bilabonnementjespers.repositorys;

import com.bilabonnementjespers.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {




JdbcTemplate template = new JdbcTemplate();

   public List<CarModel> carModelList(){

      String sql = "SELECT * FROM bilabonnement.cars;";
      RowMapper<CarModel> carModelRowMapper = new BeanPropertyRowMapper<>(CarModel.class);
      return template.query(sql,carModelRowMapper);
   }
   public void createCar(CarModel c){
      String sqlQuery = "INSERT INTO bilabonnement.cars " +
              "(car_id, brand, model, price) VALUES (?,?,?,?)";
      template.update(sqlQuery
              ,c.getCar_id(),c.getBrand()
              ,c.getModel(),c.getPrice());
   }


}
