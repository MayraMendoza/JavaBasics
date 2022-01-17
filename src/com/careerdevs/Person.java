package com.careerdevs;

public class Person {

   public String firstName;
    public String lastName;
    public  int YearOfBirth;

   // this benefits us when we have multiple instances of person(to distinguish different fields)
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName(){
        return firstName + " "+ lastName;
    }
    public int getAge (int currentYear){
        return currentYear - YearOfBirth;
    }
    // void does not return any data
    public  void sayHello (){
        System.out.println("Hello my name is " + getFullName());
    }

}
