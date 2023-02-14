package com.bilabonnementjespers.models;

public class ReturnTestModel {

    int order_id;
    int car_id;
    String repair_description;
    double repair_price = -1;
    boolean returnTestDone;

    public ReturnTestModel(){};

    public ReturnTestModel(int order_id, int car_id, String repair_description, double repair_price, boolean returnTestDone) {
        this.order_id = order_id;
        this.car_id = car_id;
        this.repair_description = repair_description;
        this.repair_price = repair_price;
        this.returnTestDone = returnTestDone;
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

    public boolean isReturnTestDone() {
        return returnTestDone;
    }

    public void setReturnTestDone(boolean returnTestDone) {
        this.returnTestDone = returnTestDone;
    }
}
