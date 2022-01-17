package com.careerdevs.sayHello;

import com.careerdevs.NameGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    //you can set scanner as a field by declaring it up here
//    // it is good to do it up here so you don't have to declare it in every
//    // method.
//    public static Scanner = new Scanner(System.in);
    public static void main(String[] args){
        // A
        Scanner scanner = new Scanner(System.in);

        whatIsYourName();
//        String name = scanner.nextLine();
//        System.out.println("Hello, nice to meet you "+ name);

        //B
        System.out.print("What is your first name? ");
        String firstName = scanner.next();
        System.out.print("What is your last name? ");
        String lastName = scanner.next();
        scanner.nextLine();


        whatIsYourFullName(firstName, lastName);

        // loop?
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("what is your full name? ");
        questions.add("what is your date of birth ex. 01/21/21? ");
        questions.add("what city were you born in? ");
        questions.add("what country were you born in? ");
        questions.add("what is your mothers maiden name? ");


       ArrayList<String> userAnswers = new ArrayList<String>();
// used scanner with int.
        int stop = 1;
        int z =0;
            while (stop == 1 && z< questions.size()) {
                System.out.println(questions.get(z));
                String userResponse = scanner.nextLine();
                userAnswers.add(userResponse);
                z++;
                System.out.println("Please enter 0 to exit or 1 to continue.");
                stop = scanner.nextInt();
                scanner.nextLine();

            }

        System.out.println("your response:");
        for(int i= 0; i< userAnswers.size(); i++){
            System.out.println(questions.get(i) +" " + userAnswers.get(i));

        }



    }

    public static void whatIsYourName (){
        // you can put a scanner inside a method
        // this method would initiate scanner ask user what their name is and store
        // the input in the variable " name".
        // if scanner is declared as a field you will have to remove this line Scanner scanner = new Scanner(System.in);.

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, nice to meet you "+ name);
    }
    public static void whatIsYourFullName (String first ,String last){
        String fullName = NameGenerator.generateFullName(first,last);
        System.out.println("Its nice to formally meet you " + fullName);

    }
    // or this could write it out like this
//    public static void whatIsYourFullName (){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your Name? ");
//        String first = scanner.nextLine();
//        System.out.print("What is your Name? ");
//        String last = scanner.nextLine();
//        String fullName = NameGenerator.generateFullName(first, last);
//        System.out.println("Its nice to formally meet you " + fullName);
//
//    }




}
