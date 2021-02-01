package com.company;

public class Main {

    public static void main(String[] args) {
        boolean test = LeapYear.isLeapYear(-1600);
        System.out.println(test);

         test = LeapYear.isLeapYear(1600);
        System.out.println(test);
         test = LeapYear.isLeapYear(2017);
        System.out.println(test);
         test = LeapYear.isLeapYear(2000);
        System.out.println(test);
	// write your code here
    }
}
