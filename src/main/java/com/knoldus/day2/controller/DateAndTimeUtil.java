package com.knoldus.day2.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DateAndTimeUtil {

    public List<String> getAllDaysOfBirthDate(int day,int month,int year){
        return IntStream.range(year, LocalDate.now().getYear())
                .mapToObj(y -> LocalDate.parse(y + "-"+month+"-"+day).getDayOfWeek().toString())
                .collect(Collectors.toList());
    }

 }
