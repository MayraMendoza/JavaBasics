package com.careerdevs;

public class Car {
    public String make;
    public String model;
    public int milage;
    public float gasTankPercent;


    public Car(String make, String model, int milage, float gasTankPercent ){
        this.make = make;
        this.model = model;
        this.milage = milage;
        this.gasTankPercent = gasTankPercent;


    }

    public String carInfo(){

        return "Make:" + this.make +", "+ "Model:"+ this.model;
    }


}