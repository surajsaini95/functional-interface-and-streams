package com.knoldus.day2.view;

import com.knoldus.day2.controller.StudentCRUD;
import com.knoldus.day2.controller.StudentUtil;
import com.knoldus.day2.model.Student;

import java.util.List;

public class StudentDriver {
    public static void main(String[] args) {
        StudentCRUD studentCRUD = new StudentCRUD();
        List<Student> listOfStudents= StudentUtil.getListOfStudents();

        studentCRUD.addStudent(listOfStudents.get(0))
                .thenAccept(students -> System.out.println("List after add operation is : "+students));

        studentCRUD.addStudent(listOfStudents.get(1))
                .thenAccept(students -> System.out.println("List after add operation is : "+students));

        studentCRUD.deleteStudentById(1)
                .thenAccept(students -> System.out.println("List after delete operation is : "+students));

        studentCRUD.addStudent(listOfStudents.get(3))
                .thenAccept(students -> System.out.println("List after add operation is : "+students));

        Student updatedStudentWithId2 = listOfStudents.get(1);
        updatedStudentWithId2.setName("abhinav");
        studentCRUD.updateStudent(updatedStudentWithId2)
                .thenAccept(students -> System.out.println("List after update operation is : "+students));

        studentCRUD.deleteStudentById(2)
                .thenAccept(students -> System.out.println("List after delete operation is : "+students));

    }
}
