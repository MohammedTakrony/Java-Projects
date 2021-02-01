package com.company;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3) {


        return num1 + num2 == num3;
    }


    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        }return false;

    }

    public static boolean isTeen(int x){
        if (x >=13 && x <= 19){
            return true;
        } return false;
    }
}

