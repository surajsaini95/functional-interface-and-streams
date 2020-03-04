package com.knoldus.day2.controller;

import com.knoldus.day2.model.Student;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class StudentCRUD {

    StudentCRUDService studentCRUDService = new StudentCRUDService();

    public CompletableFuture<List<Student>> addStudent(Student student) {
        return CompletableFuture.supplyAsync(() -> studentCRUDService.addStudent(student))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while adding new student : " + ex.getMessage());
                    return studentCRUDService.getStudents();
                });


    }

    public CompletableFuture<Student> getStudentById(int studentId) {
        return CompletableFuture.supplyAsync(() -> studentCRUDService.getStudentById(studentId))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while retrieving  student : " + ex.getMessage());
                    return new Student();
                });
    }

    public CompletableFuture<List<Student>> updateStudent(Student student) {
        return CompletableFuture.supplyAsync(() -> studentCRUDService.updateStudent(student))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while updating  student : " + ex.getMessage());
                    return studentCRUDService.getStudents();
                });
    }

    public CompletableFuture<List<Student>> deleteStudentById(int studentId) {
        return CompletableFuture
                .supplyAsync(() -> studentCRUDService.deleteStudentById(studentId))
                .exceptionally(ex -> {
                    System.out.println("Some exception occurred while deleting student : " + ex.getMessage());
                    return studentCRUDService.getStudents();
                });
    }


}
