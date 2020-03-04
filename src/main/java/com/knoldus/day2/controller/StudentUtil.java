package com.knoldus.day2.controller;

import com.knoldus.day2.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentUtil {

    public static List<Student> getListOfStudents() {
        int id = 1;
        String name = "sam";
        int age = 10;
        String primaryAddress = "delhi";
        Student s1 = new Student(id, name, age, primaryAddress);

        id = 2;
        name = "nakul";
        age = 13;
        primaryAddress = "delhi";
        Student s2 = new Student(id, name, age, primaryAddress);

        id = 3;
        name = "toni";
        age = 15;
        primaryAddress = "jaipur";
        String secondaryAddress = "noida";
        Student s3 = new Student(id, name, age, primaryAddress, secondaryAddress);

        id = 4;
        name = "raju";
        age = 15;
        primaryAddress = "gurgaon";
        Student s4 = new Student(id, name, age, primaryAddress);

        id = 5;
        name = "ali";
        age = 18;
        primaryAddress = "gurgaon";
        String secondaryAddress2 = "delhi";
        Student s5 = new Student(id, name, age, primaryAddress, secondaryAddress);

        return Arrays.asList(s1, s2, s3, s4, s5);

    }

    public List<Student> getStudentsWithoutSecondaryAddress(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAddress().getSecondaryAddress().isEmpty())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsWithoutSecondaryAddressAndNameFilter(List<Student> students) {
        return students.stream()
                .filter(student -> student.getName().startsWith("s"))
                .filter(student -> student.getAddress().getSecondaryAddress().isEmpty())
                .collect(Collectors.toList());
    }

}

