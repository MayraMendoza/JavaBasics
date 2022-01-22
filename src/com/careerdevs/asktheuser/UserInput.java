package com.careerdevs.asktheuser;

public class UserInput {
    public String city;
    public byte age;
    public short birthYear;
    public int zipCode;
    public float divisionAnswer;
    public long cityPopulation;
    public double decimalDivision;
    public boolean isFromRI;


    public UserInput (String city,byte age, short birthYear, int zipCode, float divisionAnswer, long cityPopulation,double decimalDivision, boolean isFromRI  )
    {
        this.city = city;
        this.age =age;
        this.birthYear = birthYear;
        this.zipCode = zipCode;
        this.divisionAnswer = divisionAnswer;
        this.cityPopulation =cityPopulation;
        this.decimalDivision = decimalDivision;
        this.isFromRI = isFromRI;

    }

    @Override
    public String toString() {
        return "UserInput{" +
                "city='" + city + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", zipCode=" + zipCode +
                ", divisionAnswer=" + divisionAnswer +
                ", cityPopulation=" + cityPopulation +
                ", decimalDivision=" + decimalDivision +
                ", isFromRI=" + isFromRI +
                '}';
    }
}
