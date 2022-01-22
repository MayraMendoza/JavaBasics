/**
 * Java Basics: object factory
 * clothingfactory - create scanner, ask user questions, create an instance of Clothing class and print value
 *
 */
package com.careerdevs.clothingfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // cerate a scanner
        Scanner scanner = new Scanner(System.in);

        // ask user questions
        System.out.print("Please enter clothing type e.g shirt, pants: ");
        String clothingInput = scanner.nextLine();

        System.out.print("Please enter clothing size e.g S, M, L, XL , 2X, 3X: ");
        String sizeInput = scanner.nextLine();

        System.out.print("Is this piece a part of a collection? \nplease enter true or false ");
        boolean isCollectionInput = scanner.nextBoolean();

        System.out.print("Please enter price: ");
        float priceInput = scanner.nextFloat();

        // create an instance of Clothing class
        Clothing clothingInfoInput = new Clothing(clothingInput, sizeInput, isCollectionInput, priceInput);

        // print clothing info input value
        System.out.println(clothingInfoInput.toString());

    }
}
