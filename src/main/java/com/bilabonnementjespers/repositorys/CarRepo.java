package com.bilabonnementjespers.repositorys;

import com.bilabonnementjespers.models.CarModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {

   CarModel c = new CarModel();

JdbcTemplate template = new JdbcTemplate();

   public List<CarModel> carModelList(){
      String sql = "SELECT * FROM bilabonnement.cars;";
      RowMapper<CarModel> carModelRowMapper = new BeanPropertyRowMapper<>(CarModel.class);
            return template.query(sql,carModelRowMapper);
   }
   public void createCar(){
      String sql = "INSERT INTO bilabonnement.cars (car_id, brand, model, price) VALUES (?,?,?,?)";
      System.out.println(c.getCar_id()+c.getBrand()+c.getModel()+c.getPrice());
      template.update(sql,c.getCar_id()+c.getBrand()+c.getModel()+c.getPrice());
   }

//update(sql, carModel.getCar_id(), carModel.getBrand(), carModel.getModel(), carModel.getPrice());
//" (car_id,brand,model,price) VALUES (?,?,?,?);";
//
}
