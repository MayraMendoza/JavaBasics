package com.careerdevs;

import java.util.ArrayList;

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
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

//        // bonus solution array
//        Car[] myCarArr = new Car[3];
//        myCarArr[0] = car1;
//        myCarArr[1] = car2;
//        myCarArr[2] = car3;
//
//        System.out.println(myCarArr[0].make);
//
//        //OR
        Car[] carArr= new Car[] {car1, car2, car3};

        // dont need to specify length.
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        // how you would output data
        for(int i =0; i< carArr.length ; i++ ){
            Car tempCar = carArr[i];
            // get model because field is private
            System.out.println(tempCar.getMake() +" " + tempCar.getModel());
        }

        //array list
        for(int i =0; i< carArrayList.size(); i++){
            Car tempCar = carArrayList.get(i);
            System.out.println(tempCar.getMake() +" " + tempCar.getModel());

        }






//        //----------------------------------------------------------------------------------

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


