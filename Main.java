package com.company;

import java.util.Scanner;

class Student {
    private String fullName;
    private int yearOfAdmission;
    private String address;
    private String phone;
    private int course;
    private String faculty;

    public Student(String fullName, int yearOfAdmission, String address, String phone, int course, String faculty) {
        this.fullName = fullName;
        this.yearOfAdmission = yearOfAdmission;
        this.address = address;
        this.phone = phone;
        this.course = course;
        this.faculty = faculty;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите данные для студента " + (i + 1));
            System.out.print("ФИО: ");
            String name = scanner.nextLine();
            System.out.print("Год поступления: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // чтобы съесть \n
            System.out.print("Адрес: ");
            String address = scanner.nextLine();
            System.out.print("Телефон: ");
            String phone = scanner.nextLine();
            System.out.print("Курс: ");
            int course = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Факультет: ");
            String faculty = scanner.nextLine();

            students[i] = new Student(name, year, address, phone, course, faculty);
        }

        System.out.println("\nФИО всех студентов:");
        for (Student s : students) {
            System.out.println(s.getFullName());
        }

        System.out.print("\nВведите факультет для поиска: ");
        String targetFaculty = scanner.nextLine();
        System.out.println("Студенты факультета " + targetFaculty + ":");
        for (Student s : students) {
            if (s.getFaculty().equalsIgnoreCase(targetFaculty)) {
                System.out.println(s.getFullName());
            }
        }

        System.out.print("\nВведите год для фильтра: ");
        int targetYear = scanner.nextInt();
        System.out.println("Студенты, поступившие после " + targetYear + ":");
        for (Student s : students) {
            if (s.getYearOfAdmission() > targetYear) {
                System.out.println(s.getFullName());
            }
        }

        scanner.close();
    }
}