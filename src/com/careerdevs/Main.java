package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        String firstName = "Mayra ";
        String lastName = "Mendoza";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println(fullName("Mayra", "Mendoza"));
        System.out.println(NameGenerator.generateFullName("Mayra", "Mendoza"));
    }

    public static String fullName(String first, String last) {
        String fullName = first + " " + last;

        return fullName;
    }
}

class NameGenerator {
    public static String generateFullName ( String first, String last)
    {
        String fullName = first + " " + last;
        return fullName;
    }
}
