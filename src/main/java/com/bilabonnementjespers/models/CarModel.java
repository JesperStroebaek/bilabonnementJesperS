package com.bilabonnementjespers.models;

import org.springframework.stereotype.Service;

@Service
public class CarModel {


    private int car_id;
    private String brand = "jesper";
    private String model = "jesper";
    private int price = 100;

    public CarModel(){

    }
    public CarModel(int car_id, String brand, String model, int price) {
        this.car_id = car_id;
        this.brand = brand;
        this.model = model;
        this.price = price;

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
;

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


}
