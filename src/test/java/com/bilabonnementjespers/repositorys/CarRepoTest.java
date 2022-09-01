package com.bilabonnementjespers.repositorys;

import static org.junit.jupiter.api.Assertions.*;

class CarRepoTest {



    @org.junit.jupiter.api.Test
    void createCar()
    {
        CarRepo carRepo = new com.bilabonnementjespers.repositorys.CarRepo();
        carRepo.createCar(new com.bilabonnementjespers.models.CarModel());
        carRepo.carModelList();
        assertEquals( carRepo.carModelList(), carRepo.jdbcTemplate);
    }
}