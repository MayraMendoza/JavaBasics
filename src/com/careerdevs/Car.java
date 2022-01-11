package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private int milage;
    private float gasTankPercent;


    public Car(String make, String model, int milage, float gasTankPercent ){
        this.make = make;
        this.model = model;
        this.milage = milage;
        this.gasTankPercent = gasTankPercent;


    }

    public String toString(){
        return "Make:" + this.make +", "+ "Model:"+ this.model +", "+ "Milage:"+ this.milage +", "+ "gasTankPercent:"+ this.gasTankPercent;
    }

    public String carInfo(){

        return "Make:" + this.make +", "+ "Model:"+ this.model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }
}