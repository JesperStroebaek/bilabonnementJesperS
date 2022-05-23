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

@Autowired
CarModel carModel;
@Autowired
   JdbcTemplate template; // = new JdbcTemplate();
   public void addNewCar(){
      String sql = "INSERT INTO bilabonnement.cars (car_id,brand,model,price) VALUES (?,?,?,?);";
      template.update(sql, carModel.getCar_id(), carModel.getBrand(), carModel.getModel(), carModel.getPrice());
   }
   public List<CarModel> getCarList(){
      RowMapper rowMapper = new BeanPropertyRowMapper(CarModel.class);
      String sql = "SELECT * FROM bilabonnement.cars;";
      return template.query(sql, rowMapper);

   }


}
