/**
 *Java Basics: Object Factory
 *
 */

package com.careerdevs.fruitfactory;

/**
 * @author Mayra Mendoza
 * 01/21/22
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        //ask questions
        System.out.println("Please enter fruit name: ");
        String fruitInput = scanner.nextLine();
        System.out.print("Please enter fruit color: ");
        String fruitColorInput = scanner.nextLine();
        System.out.print("does the fruit have seeds? \nplease enter true or false: ");
        boolean hasSeedsInput = scanner.nextBoolean();

        //create fruit instance
        Fruit userGeneratedFruit = new Fruit(fruitInput, fruitColorInput, hasSeedsInput);

        //print userGeneratedfruit value
        System.out.println(userGeneratedFruit.toString());
    }
}
