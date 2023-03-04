package com.abstraction;

public abstract class Animal {
    // This an example of Abstraction in java
    //You cannot instantiate abstract class, but you can create a subclass of abstract class, and that one can be
    //instantiated.
    int age;
    String name;

    public abstract void poop(); //Abstract method don't have body
}
