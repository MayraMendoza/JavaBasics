package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	String firstName = "Mayra ";
    String lastName = "Mendoza";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    System.out.println(fullName("Mayra", "Mendoza"));

    }

    public static String fullName(String first, String last)
    {
        String fullName = first + " " + last;

        return fullName;

    }
}
