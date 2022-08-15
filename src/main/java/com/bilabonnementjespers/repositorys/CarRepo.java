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
JdbcTemplate jdbcTemplate;

   public List<CarModel> carModelList(){
      String sql = "SELECT * FROM bilabonnement.cars";
      RowMapper<CarModel> rowMapper = new BeanPropertyRowMapper<>(CarModel.class);
      return jdbcTemplate.query(sql, rowMapper);
   }

   public void createCar(CarModel newCar) {
      String sql = "INSERT INTO bilabonnement.cars (" +
              "car_id, brand, model, price) VALUES " +
              "(?,?,?,?)";
      jdbcTemplate.update(sql, newCar.getCar_id(),newCar.getBrand(),newCar.getModel()
      ,newCar.getPrice());

   }
   public CarModel searchCarById(int car_id){
      String sql = "SELECT * FROM bilabonnement.cars WHERE car_id = ?";
      RowMapper<CarModel> carIdRowmapper = new org.springframework.jdbc.core.BeanPropertyRowMapper<>(CarModel.class);
      CarModel c = jdbcTemplate.queryForObject(sql, carIdRowmapper, car_id);
      return c;
   }


}
