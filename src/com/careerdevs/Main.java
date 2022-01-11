package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        // instantiate constructor for car
        Car car1 = new Car("Camaro 2ss", "Chevy", 10000, 0.10f);
        Car car2 = new Car("MustangGt", "Ford", 30000, 0.50f );
        Car car3 = new Car("Hellcat","Dodge", 100, 0.90f);

        // fields are set to private - use getters to access data
        System.out.println(car1.getMake() + " " + car1.getModel());
        System.out.println(car2.getMake() + " " + car2.getModel());
        System.out.println(car3.getMake() + " " +  car1.getModel());


// This was used for the regular assignment car info method will print out the make & model of each car instance.
//        System.out.println(car1.carInfo());
//        System.out.println(car2.carInfo());
//        System.out.println(car3.carInfo());


        // Bonus call to string method that prints out each car instance make, model, milage and gas tank percentage;
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());








//        String firstName = "Mayra";
//        String lastName = "Mendoza";
//
//        String fullName = firstName + lastName;
//        System.out.println(fullName);
//        System.out.println(fullName("Mayra", "Mendoza"));
//        System.out.println(NameGenerator.generateFullName("Mayra", "Mendoza"));
//
////        Person myPerson = new Person(firstName,lastName); // default constructor
////        System.out.println("Firstname " + myPerson.firstName);
////        System.out.println("LastName " + myPerson.lastName);
////        System.out.println(myPerson.getFullName());
////        //myPerson.sayHello();
//        //-------------------------------------
////        Person [] allPeople = new Person[People.firstNames.length];
////        for (int i = 0; i< People.firstNames.length ; i++){
////            //System.out.println(People.lastNames[i]);
////            // we can create persons out of this.
////            String fName = People.firstNames[i];
////            String lName = People.lastNames[i];
////            Person tempPerson = new Person(fName, lName);
////            // add the new person to the array person (out equivalent of pushing)
////            allPeople[i] = tempPerson;
//////            tempPerson.sayHello();
////            //System.out.println(Arrays.toString(allPeople));
//
//      //  }

    }

    public static String fullName(String first, String last) {
        String fullName = first + " " + last;

        return fullName;
    }
}


