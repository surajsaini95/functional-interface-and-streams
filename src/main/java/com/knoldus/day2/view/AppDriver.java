package com.knoldus.day2.view;

import com.knoldus.day2.controller.DateAndTimeUtil;
import com.knoldus.day2.controller.StudentUtil;
import com.knoldus.day2.controller.WordCountUtil;

public class AppDriver {
    public static void main(String[] args) {

        StudentUtil studentUtil = new StudentUtil();
        DateAndTimeUtil dateAndTimeUtil = new DateAndTimeUtil();
        WordCountUtil wordCountUtil = new WordCountUtil();

        System.out.println(studentUtil.getStudentsWithoutSecondaryAddress(StudentUtil.getListOfStudents()));
        System.out.println(studentUtil.getStudentsWithoutSecondaryAddressAndNameFilter(StudentUtil.getListOfStudents()));

        int day=10;
        int month=10;
        int year=1995;
        System.out.println(dateAndTimeUtil.getAllDaysOfBirthDate(day,month,year));

        String timeZone="Asia/Tokyo";
        System.out.println(dateAndTimeUtil.getTimeFromTimeZone(timeZone));


        String birthDate="2020-01-01";
        String deathDate="2020-01-02";
        System.out.println(dateAndTimeUtil.getLifeDurationInSeconds(birthDate,deathDate));

        System.out.println(dateAndTimeUtil.getLeapYearsAfterFirstRepublicDay());


        String filePath = "./src/main/resources/data";
        System.out.println(wordCountUtil.getWordCountOfDataFromFile(filePath));
    }
}
