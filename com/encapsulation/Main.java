package com.encapsulation;

// This an example of encapsulation in java
//It's one of the pillar of OOP which is used to hide data. Thus, we use setter and getter method to do so.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Charles");
        s1.setIdNumber(9653984);
        System.out.println("My name is "+ s1.getName() + " and my student Id is " + s1.getIdNumber() + ".");
    }
}
