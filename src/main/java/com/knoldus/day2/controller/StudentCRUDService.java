package com.knoldus.day2.controller;

import com.knoldus.day2.model.Student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentCRUDService {

    public List<Student> students=new LinkedList<>();

    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public Student getStudentById(int studentId) {
        Student defaultStudent = new Student();
        return students.stream()
                .filter(student -> student.getId() == studentId).findFirst().orElse(defaultStudent);
    }

    public List<Student> updateStudent(Student student) {
        if (getStudentById(student.getId()).isValid()) {
            deleteStudentById(student.getId());
            addStudent(student);
            return students;
        } else {
            return students;
        }
    }

    public List<Student> deleteStudentById(int studentId) {
        if (getStudentById(studentId).isValid()) {
            students.remove(getStudentById(studentId));
            return students;
        } else {
            return students;
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
