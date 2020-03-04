package com.knoldus.day2.controller;

import com.knoldus.day2.model.Student;

import java.util.Collections;
import java.util.List;

public class StudentCRUD {

    public static List<Student> students = Collections.emptyList();

    public List<Student> getStudents() {
        return students;
    }

    boolean addStudent(Student student) {
        return students.add(student);
    }

    Student getStudentById(int studentId) {
        Student defaultStudent = new Student();
        return students.stream().filter(student -> student.getId() == studentId).findFirst().orElse(defaultStudent);
    }

    boolean updateStudent(Student student) {
        if (getStudentById(student.getId()).isValid()) {
            deleteStudentById(student.getId());
            return addStudent(student);
        } else {
            return false;
        }
    }

    boolean deleteStudentById(int studentId) {
        if (getStudentById(studentId).isValid()) {
            return students.remove(getStudentById(studentId));
        } else {
            return false;
        }
    }


}
