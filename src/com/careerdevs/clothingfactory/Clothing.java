/**
 * Assignment- java basic: object factory
 * Create Clothing class. create fields, a constructor and a toString method
 */
package com.careerdevs.clothingfactory;

public class Clothing {
    public String clothingType;
    public String size;
    public boolean isCollection;
    public float price;

    // create a constructor
    public Clothing (String clothingType, String size, boolean isCollection, float price){
        this.clothingType = clothingType;
        this.size = size;
        this.isCollection = isCollection;
        this.price = price;
    }

    // auto-generate a toString method
    @Override
    public String toString() {
        return "Clothing{" +
                "clothingType='" + clothingType + '\'' +
                ", size='" + size + '\'' +
                ", isCollection=" + isCollection +
                ", price=" + price +
                '}';
    }
}
