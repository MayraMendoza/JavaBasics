package com.careerdevs.sayHello;

import com.careerdevs.NameGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        // A
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
//        whatIsYourName();
//        String name = scanner.nextLine();
//        System.out.println("Hello, nice to meet you "+ name);
//
//        //B
//        System.out.print("What is your first name? ");
//        String firstName = scanner.next();
//        System.out.print("What is your last name? ");
//        String lastName = scanner.next();
//
//
//        whatIsYourFullName(firstName, lastName);
//
        // loop?
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("what is your name? ");
        questions.add("how old are you? ");
        questions.add("what is your favorite color? ");
        questions.add("what city are you from? ");
        questions.add("whats your favorite holiday? ");


       ArrayList<String> userAnswers = new ArrayList<String>();

       //System.out.println("To exit enter N to continue please enter y");
        //            stop = scanner.next();
        //            if (stop.equalsIgnoreCase("y")) {

//        String stop= "y";
//        for(int i= 0; ;){

        int stop = 1;
        int z =0;
            while (stop == 1 && z< questions.size()) {
                System.out.println(questions.get(z));
                String userResponse = scanner1.nextLine();
                userAnswers.add(userResponse);
                z++;
                System.out.println("Please enter 0 to exit or 1 to continue.");
                stop = scanner.nextInt();

            }

        System.out.println("your response:");
        for(int i= 0; i< userAnswers.size(); i++){
            System.out.println(questions.get(i) +" " + userAnswers.get(i));

        }



    }

    public static void whatIsYourName (){
        System.out.print("What is your Name? ");
    }
    public static void whatIsYourFullName (String first ,String last){
        String fullName = NameGenerator.generateFullName(first,last);
        System.out.println("Its nice to formally meet you " + fullName);

    }

}
