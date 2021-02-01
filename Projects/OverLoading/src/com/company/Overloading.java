package com.company;

public class Overloading {


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet <= 0) || (inches < 0) || (inches > 12)) {

            return -1;
        }
double cent = (feet * 12) * 2.54 ;
        cent+= inches *2.54;
        System.out.println("feet " + feet + "  Inches" + inches +"= " +cent+ "cm"  );
        return cent;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double cal = (int) inches / 12;
        double reminder = (int) inches % 12;
        System.out.println("inches are equal to " + cal + "feet and "+ reminder + "cm");
        return calcFeetAndInchesToCentimeters(cal,reminder);
    }
}
