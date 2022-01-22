package com.careerdevs.fruitfactory;

public class Fruit {
    // create a class fruit with the Fields: name (String), color (String), hasSeeds (boolean)
    String name;
    String color;
    boolean hasSeeds;

    //create a constructor for the class
    public Fruit(String name, String color, boolean hasSeeds){
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;

    }


    //auto-generate toString method


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", hasSeeds=" + hasSeeds +
                '}';
    }
}
