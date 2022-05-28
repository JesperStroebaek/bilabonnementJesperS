package com.bilabonnementjespers.models;

import org.springframework.stereotype.Service;


public class CarModel {

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int car_id;
    private String brand;
    private String model;
    private int price;

    public CarModel() {

    }

    public CarModel(int car_id, String brand, String model, int price) {
        this.car_id = car_id;
        this.brand = brand;
        this.model = model;
        this.price = price;

    }

}