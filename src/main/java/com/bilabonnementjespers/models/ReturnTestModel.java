package com.bilabonnementjespers.models;

public class ReturnTestModel {

    int testId;
    String damageDescription;
    double returnTestPrice;


    public ReturnTestModel() {
    }

    public ReturnTestModel(int testId, String damageDescription, double returnTestPrice)
    {
        this.testId = testId;
        this.damageDescription = damageDescription;
        this.returnTestPrice = returnTestPrice;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getDamageDescription() {
        return damageDescription;
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public double getReturnTestPrice() {
        return returnTestPrice;
    }

    public void setReturnTestPrice(double returnTestPrice) {
        this.returnTestPrice = returnTestPrice;
    }
}