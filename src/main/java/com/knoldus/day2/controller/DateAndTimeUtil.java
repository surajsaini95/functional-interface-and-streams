package com.knoldus.day2.controller;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DateAndTimeUtil {

    public List<String> getAllDaysOfBirthDate(int day, int month, int year) {
        return IntStream.range(year, LocalDate.now().getYear())
                .mapToObj(y -> LocalDate.parse(y + "-" + month + "-" + day).getDayOfWeek().toString())
                .collect(Collectors.toList());
    }

    public String getTimeFromTimeZone(String timeZone) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
        String timeFromTimeZone = zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME) + " - " + timeZone + ",UTC"
                + zonedDateTime.getOffset().toString();
        return timeFromTimeZone;
    }

    public Long getLifeDurationInSeconds(String birthDate, String deathDate) {
        return Duration.between(LocalDate
                .parse(birthDate).atStartOfDay(), LocalDate.parse(deathDate).atStartOfDay()).toSeconds();
    }

    public List<Integer> getLeapYearsAfterFirstRepublicDay() {
        int firstRepublicDayYear = 1950;
        String republicDayInMMDD = "01-26";
        int currentRepublicDayYear = LocalDate.now().getYear() + 1;
        return IntStream.range(firstRepublicDayYear, currentRepublicDayYear)
                .filter(year -> LocalDate.parse(year + "-" + republicDayInMMDD).isLeapYear()).mapToObj(year -> year).collect(Collectors.toList());
    }

}
