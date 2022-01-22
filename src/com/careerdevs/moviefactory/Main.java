/**
 * Java Basics: object factory
 * moviefactory - create scanner, ask user questions, create an instance of Movie class and print value
 *
 */
package com.careerdevs.moviefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner
        Scanner scanner = new Scanner(System.in);

        //title (String), director (String), runtimeInMin (float), hasBeenReleased (boolean
        // ask user questions
        System.out.print("please enter movie title: ");
        String titleInput = scanner.nextLine();

        System.out.print("please enter movie director: ");
        String directorInput = scanner.nextLine();

        System.out.print("please enter movie run time in min: ");
        float runtimeInput = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("has the movie been released ? \nplease enter true or false: ");
        boolean hasBeenReleased = scanner.nextBoolean();

        // create an instance of movie class
        Movie userInput = new Movie(titleInput, directorInput, runtimeInput, hasBeenReleased);

        // print user input value
        System.out.println(userInput.toString());
    }



}
