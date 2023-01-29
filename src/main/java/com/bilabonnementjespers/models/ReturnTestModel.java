package com.bilabonnementjespers.models;

public class ReturnTestModel {

    int order_id;
    int car_id;
    String first_name;
    String last_name;
    String repair_description;
    double repair_price = -1;

    public ReturnTestModel(){};

    public ReturnTestModel(int order_id, int car_id, String first_name, String last_name, String repair_description, double repair_price) {
        this.order_id = order_id;
        this.car_id = car_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.repair_description = repair_description;
        this.repair_price = repair_price;
    }



    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRepair_description() {
        return repair_description;
    }

    public void setRepair_description(String repair_description) {
        this.repair_description = repair_description;
    }

    public double getRepair_price() {
        return repair_price;
    }

    public void setRepair_price(double repair_price) {
        this.repair_price = repair_price;
    }



}
