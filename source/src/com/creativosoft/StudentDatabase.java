package com.lab1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class StudentDatabase {
    // Attributes.
    private ArrayList<Student> students;
    private static StudentDatabase studentDatabase;
    private File file;
    private ObjectMapper objectMapper;

    // Methods.
    // Constructor.
    private StudentDatabase() {
        this.students = new ArrayList<>();
        this.file = new File("Student_Database.json");
        this.objectMapper = new ObjectMapper();
        
    }

    // Getter.
 /home/aashir/Downloads/Eclipse/Lab1   static StudentDatabase getInstance() {
        if (studentDatabase == null) {
            studentDatabase = new StudentDatabase();
        }
        return studentDatabase;
    }

    // Method to add student.
    void addStudent(Student student) {
        students.add(student);
        saveStudents();
    }

    
    // Print all students.
    void printStudents() {
        for (Student student : students) {
                System.out.println(student.toString());
        }
    }

    // Private method to save data to json.
    private void saveStudents() {
       
    }

    // Private method to read data from json.
    

    // Getter for students.
    ArrayList<Student> getStudents() {
        return students;
    }
}
