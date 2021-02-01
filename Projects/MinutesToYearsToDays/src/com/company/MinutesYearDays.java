package com.company;

public class MinutesYearDays {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid value");
        }
        long hour = minutes / 60 ;

        long day = hour / 24 ;


        long year = day / 365 ;
        day = day %365;


        System.out.println( minutes+"m = " + year+ "Y " + day+ "z");
    }
}
