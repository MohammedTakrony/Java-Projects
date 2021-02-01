package com.company;

public class Main {

    public static void main(String[] args) {
        long Mile = toMilesPerHour(10.5);
        System.out.println("Miles = " + Mile);

        printconversion(10.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printconversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long MilePerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h= "+ MilePerHour + " mi/h ");

        }

    }
}
