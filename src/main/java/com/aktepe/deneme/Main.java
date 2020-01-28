package com.aktepe.deneme;

import com.aktepe.deneme2.Programmer;
import com.aktepe.deneme2.Tester;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(20, 10);
        Programmer programmer = new Programmer(20, 10);
        System.out.println(tester.calculateSalary());
        System.out.println(programmer.calculateSalary());

        /*
            Bir tane Vehicle Class'i olusturun.

            Bir tane Car Class.
            Bir tane Motorcycle Class.
            Bir tane Truck.

            int speed, String color, double engine, int size, String fuelType, double fuel;
            isFuelOVer() --> Checks fuel is empty or not

            Bir tane parametreli, bir tane parametresiz (default) constructor tanimlanacak.
            Iclerinde hangisinin hangi sira ile cagrildigi arastirilacak.
            Super keyword u kullanilacak.

            final keywordu bir degisken, bir fonksiyon ve bir class icin kullanilip neye yaradigi anlasilacak.
        */
    }
}
