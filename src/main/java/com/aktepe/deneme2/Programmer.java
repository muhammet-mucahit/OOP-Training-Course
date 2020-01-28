package com.aktepe.deneme2;

public class Programmer extends Employee {
    public Programmer() {
        System.out.println("I am the Sub Class Programmer");
        hourlyRate = 40;
        workingHours = 10;
    }

    public Programmer(int hourlyRate, int workingHours) {
        super(hourlyRate, workingHours);
    }
}
