package com.company;

import java.util.Scanner;

class Student {
    private String fullName;
    private int admissionYear;
    private String address;
    private String phone;
    private int course;
    private String faculty;

    public Student(String fullName, int admissionYear, String address, String phone, int course, String faculty) {
        this.fullName = fullName;
        this.admissionYear = admissionYear;
        this.address = address;
        this.phone = phone;
        this.course = course;
        this.faculty = faculty;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите данные для студента #" + (i + 1));
            System.out.print("ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Год поступления: ");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.print("Адрес: ");
            String address = scanner.nextLine();

            System.out.print("Телефон: ");
            String phone = scanner.nextLine();

            System.out.print("Курс: ");
            int course = Integer.parseInt(scanner.nextLine());

            System.out.print("Факультет: ");
            String faculty = scanner.nextLine();

            students[i] = new Student(fullName, year, address, phone, course, faculty);
        }

        System.out.println("\nа) ФИО всех студентов:");
        for (Student s : students) {
            System.out.println(s.getFullName());
        }

        System.out.print("\nб) Введите факультет для фильтрации: ");
        String searchFaculty = scanner.nextLine();
        for (Student s : students) {
            if (s.getFaculty().equalsIgnoreCase(searchFaculty)) {
                System.out.println(s.getFullName());
            }
        }

        System.out.print("\nв) Введите год для фильтрации (поступившие после): ");
        int yearFilter = Integer.parseInt(scanner.nextLine());
        for (Student s : students) {
            if (s.getAdmissionYear() > yearFilter) {
                System.out.println(s.getFullName());
            }
        }
    }
}
