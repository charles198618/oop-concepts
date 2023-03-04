package com.inheritance;

// This is a basic example of Inheritance in java. It's one of the OOP concept.
// So the child can inherit property and method of the parent class

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Inheritance");
        System.out.println("");

        //Dog inherits from Animal
        Animal dog = new Animal();
        dog.bark();
        dog.run();
        System.out.println( "I have " + dog.legs + " legs." );

        //Cat inherits from Animal
        Animal cat = new Animal();
        cat.meow();
        cat.run();
        System.out.println( "I have " + cat.legs + " legs." );

    }
}
