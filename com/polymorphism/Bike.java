package com.polymorphism;

public class Bike extends Vehicle{
    private int tire;

    public static void run() {
        System.out.println("We can run fast, but not the same way!!!!!!!!!!!");
    }

    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

}
