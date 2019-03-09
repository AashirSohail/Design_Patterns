package com.lab1;

import java.util.Date;

class StudentFactory {
    // Methods.
    static Student getStudent(String firstName, String lastName, Date doB, String address, String className) {
        return new Student(firstName, lastName, doB, address, className);
    }
}
