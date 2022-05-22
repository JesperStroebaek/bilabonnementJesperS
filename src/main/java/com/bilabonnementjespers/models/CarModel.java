package com.bilabonnementjespers.models;

public class CarModel {

    private int carId;
    private String brand;

    public void CarModel(){

    };

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarModel(int carId, String brand) {
        this.carId = carId;
        this.brand = brand;
    }
}
