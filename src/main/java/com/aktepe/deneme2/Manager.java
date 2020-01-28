package com.aktepe.deneme2;

public class Manager extends Employee {
    public Manager() {
        System.out.println("I am the Sub Class Manager");
        hourlyRate = 50;
        workingHours = 6;
    }

    public Manager(int hourlyRate, int workingHours) {
        super(hourlyRate, workingHours);
    }
}
