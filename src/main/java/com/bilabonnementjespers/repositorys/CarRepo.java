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
   public CarModel searchCar(int car_id){
      String sql = "SELECT * FROM bilabonnement.cars WHERE car_id = ?;";
      RowMapper<CarModel> carIdRowmapper = new BeanPropertyRowMapper<>(CarModel.class);
      CarModel c = jdbcTemplate.queryForObject(sql, carIdRowmapper, car_id);
      return c;
   }
   public boolean deleteCar(int car_id){
      String sql = "DELETE FROM bilabonnement.cars WHERE car_id = ?";
      return jdbcTemplate.update(sql, car_id) > 0;
   }
   public void updateCar(int car_id, CarModel c){
      String sql = "UPDATE bilabonnement.cars SET car_id = ?, brand = ?, model = ?, price = ?";
      jdbcTemplate.update(sql,c.getCar_id(),c.getBrand(),c.getModel(),c.getPrice());
   }


}
