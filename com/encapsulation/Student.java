package com.encapsulation;

// We hide data with Encapsulation
public class Student {
    private int idNumber;
    private String name;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
