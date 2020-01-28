package com.aktepe.deneme2;

public class Employee {
    protected int hourlyRate;
    protected int workingHours;

    public Employee() {
        System.out.println("I am the Super Class Employee");
    }

    public Employee(int hourlyRate, int workingHours) {
        System.out.println("This is Employee");
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    public int calculateSalary() {
        System.out.println("I am the Employee Class Calculate Salary");
        return hourlyRate * workingHours * 250;
    }
}
