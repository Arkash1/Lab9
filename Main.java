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
            System.out.println("������� ������ ��� �������� " + (i + 1));
            System.out.print("���: ");
            String name = scanner.nextLine();
            System.out.print("��� �����������: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // ����� ������ \n
            System.out.print("�����: ");
            String address = scanner.nextLine();
            System.out.print("�������: ");
            String phone = scanner.nextLine();
            System.out.print("����: ");
            int course = scanner.nextInt();
            scanner.nextLine();
            System.out.print("���������: ");
            String faculty = scanner.nextLine();

            students[i] = new Student(name, year, address, phone, course, faculty);
        }

        System.out.println("\n��� ���� ���������:");
        for (Student s : students) {
            System.out.println(s.getFullName());
        }

        System.out.print("\n������� ��������� ��� ������: ");
        String targetFaculty = scanner.nextLine();
        System.out.println("�������� ���������� " + targetFaculty + ":");
        for (Student s : students) {
            if (s.getFaculty().equalsIgnoreCase(targetFaculty)) {
                System.out.println(s.getFullName());
            }
        }

        System.out.print("\n������� ��� ��� �������: ");
        int targetYear = scanner.nextInt();
        System.out.println("��������, ����������� ����� " + targetYear + ":");
        for (Student s : students) {
            if (s.getYearOfAdmission() > targetYear) {
                System.out.println(s.getFullName());
            }
        }

        scanner.close();
    }
}