package com.yash.datetime.timeAPI;

import java.time.*;
import java.util.Scanner;

public class TimeDiffClasses {
    public static void localDateExample() {

        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(2);
        System.out.println("Yesterday : " + yesterday + "\nToday : " + date + "\nTomorrow : " + tomorrow);

        System.out.println("--------------------------------------");
        LocalDate birthdate = LocalDate.of(2001, 3, 16);

        Period age = Period.between(birthdate, date);
        System.out.println("My Age \nYears:" + age.getYears() + "\nMonths:" + age.getMonths() + "\nDays:" + age.getDays());
    }

    public static void localDateTimeExample() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Time : " + currentTime.toLocalDate() + "\n" + currentTime.toLocalTime());

    }

    public static void yearExample() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Leap year Checking \nEnter year : ");
        int year = scn.nextInt();
        Year isLeapOrNot = Year.of(year);
        if (isLeapOrNot.isLeap()) {
            System.out.println("Yes, It is!");
        } else {
            System.out.println("It's not!");
        }
    }

    public static void zoneId() {
        ZoneId systemZone = ZoneId.systemDefault();
        System.out.println("Current System's Zone: " + systemZone);
        ZoneId americaZone = ZoneId.of("America/Los_Angeles");
        LocalTime americaZoneTime = LocalTime.now(americaZone);
        System.out.println("America/Los_Angeles:" + americaZoneTime.getHour() + ":" + americaZoneTime.getMinute() + ":" + americaZoneTime.getSecond());
    }
}
