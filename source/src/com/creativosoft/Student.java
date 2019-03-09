package com.lab1;

import java.util.Date;

public class Student {
    // Attributes.
    private String firstName;
    private String lastName;
    private Date doB;
    private String address;
    private String className;

    // Methods.
    // Constructor.
    Student(String firstName, String lastName, Date doB, String address, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.doB = doB;
        this.address = address;
        this.className = className;
    }
    Student() {

    }

    // Setters.
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    void setDoB(Date doB) {
        this.doB = doB;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void setClassName(String className) {
        this.className = className;
    }

    // Getters.
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    private Date getDoB() {
        return doB;
    }
    private String getAddress() {
        return address;
    }
    private String getClassName() {
        return className;
    }

    // toString method.
    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" +
                "Date of Birth: " + getDoB() + "\n" + "Address: " + getAddress() + "\n" +
                "Class Name: " +getClassName() + "\n";
    }
}
