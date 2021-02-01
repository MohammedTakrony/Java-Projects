package com.company;

public class Main {

    public static void main(String[] args) {
        double FirstNumber= 20.00;
        double SecondNumber= 80.00;

        double Total;
        Total = (FirstNumber + SecondNumber) *100;
        System.out.println(Total);
        double Reminder = Total %40.00;
        System.out.println(Reminder);

        boolean F = (Reminder == 0) ? true : false ;
        System.out.println("the Reminder " +F);

        if (!F) {
            System.out.println("Get some Reminder");
        }

	// write your code here
    }
}
