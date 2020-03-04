package com.knoldus.day2.view;

import com.knoldus.day2.controller.StudentUtil;

public class AppDriver {
    public static void main(String[] args) {
        StudentUtil studentUtil=new StudentUtil();

        System.out.println(studentUtil.getStudentsWithoutSecondaryAddress(StudentUtil.getListOfStudents()));

        System.out.println(studentUtil.getStudentsWithoutSecondaryAddressAndNameFilter(StudentUtil.getListOfStudents()));
    }
}
