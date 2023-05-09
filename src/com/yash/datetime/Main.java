package com.yash.datetime;

import com.yash.datetime.timeAPI.TimeDiffClasses;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- LocalDate Example ----------");
        TimeDiffClasses.localDateExample();
        System.out.println("---------- LocalDateTime Example ----------");
        TimeDiffClasses.localDateTimeExample();
        System.out.println("---------- Year Example ----------");
        TimeDiffClasses.yearExample();
        System.out.println("---------- Zone Example ----------");
        TimeDiffClasses.zoneId();
    }
}