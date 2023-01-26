package com.bilabonnementjespers.models;

public class ReturnTestModel {

    int orderId;
    int carId;
    String firstName;
    String lastName;
    String repairDescription;
    double repairPrice = -1;

    public ReturnTestModel(){

    };

    public ReturnTestModel(int orderId, int carId, String firstName, String lastName, String repairDescription, double repairPrice) {
        this.orderId = orderId;
        this.carId = carId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.repairDescription = repairDescription;
        this.repairPrice = repairPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public double getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(double repairPrice) {
        this.repairPrice = repairPrice;
    }
}
