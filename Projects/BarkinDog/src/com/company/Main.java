package com.company;

public class Main {

    public static void main(String[] args) {
       boolean M = BarkingDog.shouldWakeUP(true,1);
        System.out.println(M);

        M = BarkingDog.shouldWakeUP(false,2);
        System.out.println(M);

         M = BarkingDog.shouldWakeUP(true,8);
        System.out.println(M);

        M = BarkingDog.shouldWakeUP(true,-1);
        System.out.println(M);
	// write your code here
    }
}
