package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finalNumber = 20;
        int totalNumber = 0;
        while (number <= finalNumber) {
            number++;
            if (!isEven(number)) {
                continue;
            }
            System.out.println("Even number is = " + number);
            totalNumber++;
            if (totalNumber == 5) {
                break;
            }

        }
        System.out.println("Total Number is = " + totalNumber);
    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {

            return true;
        }
        return false;
    }
}
