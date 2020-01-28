package com.aktepe.deneme2;

public class Tester extends Employee {
    public Tester() {
        System.out.println("I am the Sub Class Tester");
        hourlyRate = 40;
        workingHours = 8;
    }

    public Tester(int hourlyRate, int workingHours) {
        super(hourlyRate, workingHours);
        System.out.println("This is Tester");
    }

    @Override
    public int calculateSalary() {
        System.out.println("I am overridden in Tester Class");
        int bonus = 10000;
        return hourlyRate * workingHours * 250 + bonus;
    }
}