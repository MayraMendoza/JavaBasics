package com.careerdevs.sayHello;

import com.careerdevs.NameGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // A
        Scanner scanner = new Scanner(System.in);
        whatIsYourName();
        String name = scanner.nextLine();
        System.out.println("Hello, nice to meet you "+ name);

        //B
        System.out.print("What is your first name? ");
        String firstName = scanner.next();
        System.out.print("What is your last name? ");
        String lastName = scanner.next();


        whatIsYourFullName(firstName, lastName);


    }

    public static void whatIsYourName (){
        System.out.print("What is your Name? ");
    }
    public static void whatIsYourFullName (String first ,String last){
        String fullName = NameGenerator.generateFullName(first,last);
        System.out.println("Its nice to formally meet you " + fullName);

    }

}
