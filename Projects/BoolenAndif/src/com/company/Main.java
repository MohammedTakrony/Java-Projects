package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean Allince = false ;
//        if (Allince == true); // the (;) make allways false
//        System.out.println("This ia Allince");
//        System.out.println("This is not Allince");
        // write your code here

//        boolean Allince = false ;
//        if (Allince == true)
//        System.out.println("This ia Allince");// this line is false but the secened line is true
//        System.out.println("This is not Allince");

        boolean Allince = false;
        if (Allince == true) { // to make every code works we should have the ({}) right now all the code are false
            System.out.println("This ia Allince");
            System.out.println("This is not Allince");
        }

        int TopScore = 100;
        if (TopScore == 100) {
            System.out.println("You have Top Score");
        }

        int SecondScore = 80;
        if ((TopScore > SecondScore) && (TopScore >= 100)) {
            System.out.println("You Got The Top Score");
        }
        boolean isCar = false;
        if (!isCar){  // The (!isCar) and (isCar != true) is the same !
            System.out.println("isCar is false");
        }
        int age = 20;
        boolean Over = (age == 20)?true:false;
        System.out.println("The age is over 20");

    }
    }


    // Conditional Operators // 
