package com.polymorphism;

// This is a basic example of polymorphism in java. It's one of the OOP concept.
// So we can have the same method name, but different implementation.

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Polymorphism");

        Vehicle car = new Vehicle();
        car.run();

        Bike bike = new Bike();
        bike.run();

    }
}
