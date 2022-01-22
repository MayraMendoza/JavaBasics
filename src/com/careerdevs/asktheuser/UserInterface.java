/**
 * Java Basics: ask the user
 * Create one question and response for each data types.
 * Organize your code better by creating a method for each question.
 * Create a class that can be generated from ALL the questions asked, then create an instance of your class using the user responses
 * Add conditional logic to at least 3 of your questions
 */
package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        // save user input to a variable that will later be called when creating an instance
        String city = inputCity();
        byte age = inputAge();
        short birthYear= inputBirthYear();
        int zipCode = inputZipCode();
        float userAnswerDivision= inputDivisionAnswer();
        long population = inputCityPopulation();
        double inputDivideDecimals = divideDecimals();
        boolean fromRi = inputFromRI();

        // create an instance of the userInput class
        UserInput user1 = new UserInput(city, age, birthYear, zipCode, userAnswerDivision, population,inputDivideDecimals, fromRi);

        //Print out user1 instance
        System.out.println(user1.toString());

    }

        public static String inputCity(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("please enter the name of the city you live in: ");
            String userCity = scanner.nextLine();
            return userCity;
        }
        public static byte inputAge() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("please enter your age: ");
            byte userAge = scanner.nextByte();
            return userAge;
        }

        public static short inputBirthYear() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your birth year: ");
            Short userBirthYear = scanner.nextShort();
            if (userBirthYear > 1997) {
                System.out.println("Hello, genZ!");
                //1981 – 1996
            } else if (1996 > userBirthYear && userBirthYear > 1981) {
                System.out.println("Hello, millennial!");
            } else
                System.out.println("you must be ancient. ");
            return userBirthYear;
        }


        public static int inputZipCode() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your zipcode: ");
            int userZipcode = scanner.nextInt();
            return userZipcode;
        }


        public static float inputDivisionAnswer() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("what is 4 divided by 10? ");
            float UserAnswerDivision = scanner.nextFloat();
            while (UserAnswerDivision != 2.5) {
                System.out.print("Wrong! please try again: ");
                UserAnswerDivision = scanner.nextFloat();
                if (UserAnswerDivision == 2.5) {
                    System.out.println("it took you a few tries...!");
                }
            }
            return UserAnswerDivision;
        }

        public static long inputCityPopulation() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your city population: ");
            long cityPopulation = scanner.nextLong();
            return cityPopulation;
        }

        public static double divideDecimals() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("divide two decimals. please enter a decimal you want to divide by:  ");
            double firstDecimal = scanner.nextDouble();
            System.out.println("please enter decimal you want to divide: ");
            double secondDecimal = scanner.nextDouble();
            double divideTwoDecimals = firstDecimal / secondDecimal;
            System.out.println(divideTwoDecimals);
            return divideTwoDecimals;
        }


        public static boolean inputFromRI(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter true if you are from Rhode island and false if you are from another state ");
            boolean fromRI = scanner.nextBoolean();
            int userRIYears =0 ;  // years user has lived in rhode island.
            if(fromRI == true) {
            System.out.println("Cool! how many years have you lived in Rhode island?");
            userRIYears = scanner.nextInt();
            }
            return fromRI;
        }

}

