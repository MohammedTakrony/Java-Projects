package com.company;

public class Main {

    public static void main(String[] args) {
        boolean test = EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(test);

        test = EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(test);

        test = EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(test);

        System.out.println("==================================");

        boolean test2 = EqualSumChecker.hasTeen(9,99,19);
        System.out.println(test2);

        test2 = EqualSumChecker.hasTeen(23,15,24);
        System.out.println(test2);

        test2 = EqualSumChecker.hasTeen(22,23,34);
        System.out.println(test2);

        System.out.println("==================================");

        boolean test3 = EqualSumChecker.isTeen(9);
        System.out.println(test3);

        test3 = EqualSumChecker.isTeen(13);
        System.out.println(test3);


	// write your code here
    }
}
