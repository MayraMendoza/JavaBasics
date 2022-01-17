package com.careerdevs.carFactory;

import com.careerdevs.Car;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print( createAcar());
        System.out.println(createAnObject());




    }
    public static String createAcar(){
        // import scanner and instantiate it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter car Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Please enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Please enter car Owner: ");
        String owner = scanner.nextLine();
        return owner +" owns the car "+ carMake + " " +carModel ;

    }

    public static String createAnObject(){
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter car Make: ");
        String make = scanner.nextLine();
        System.out.print("Please enter car Model: ");
        String model = scanner.nextLine();
        System.out.print("Please enter car miles: ");
        int mileage = scanner.nextInt();
        System.out.print("Please enter gas tank percentage: ");
        float gasTankPercentage = scanner.nextFloat();

        Car car4 = new Car(make, model, mileage, gasTankPercentage);
        return car4.toString();
    }
}
