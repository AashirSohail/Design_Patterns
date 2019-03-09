package com.lab1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    // Attributes.
    private static Scanner scanner = new Scanner(System.in);
    private static StudentDatabase studentDatabase = StudentDatabase.getInstance();
    private static ArrayList<Student> currentStudents = studentDatabase.getStudents();

    // Main method to start program execution.
    public static void main(String[] args) {
        displayMenu();
    }

    // Method to display menu.
    private static void displayMenu() {
        System.out.print("\tWelcome to Student Management Application.\n");
        System.out.print("Please select an option from the list below.\n\n");
        System.out.println("1. Add Student.");
        System.out.println("2. Remove Student.");
        System.out.println("3. Print Students.");
        System.out.println("4. Exit.");
        System.out.print("\nYour Choice: ");
        getChoice();
    }

    // Method to get choice input from user.
    private static void getChoice() {
        int choice = scanner.nextInt();

        if (choice == 1) {
            getStudentData();
            displayMenu();
        } else if (choice == 2) {
            removeStudent();
            displayMenu();
        } else if (choice == 3) {
            printAllStudents();
            displayMenu();
        }
    }

    // Method to get student data from user.
    private static void getStudentData() {
        Student student = new Student();

        System.out.println("Enter Student's First Name: ");
        scanner.nextLine();
        student.setFirstName(scanner.nextLine().toLowerCase());

        System.out.println("Enter Student's Last Name: ");
        student.setLastName(scanner.nextLine().toLowerCase());

        System.out.println("Enter Student's Date of Birth: (dd/mm/yyyy)");
        String date = scanner.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date doB = dateFormat.parse(date);
            student.setDoB(doB);
        } catch (ParseException e) {
            System.out.println("Wrong Date Entry.");
        }

        System.out.println("Enter Student's Address: ");
        student.setAddress(scanner.nextLine().toLowerCase());

        System.out.println("Enter Student's Class Name: ");
        student.setClassName(scanner.nextLine().toLowerCase());

        studentDatabase.addStudent(student);
    }

   

    // Method to print all students.
    private static void printAllStudents() {
        studentDatabase.printStudents();
    }
}
