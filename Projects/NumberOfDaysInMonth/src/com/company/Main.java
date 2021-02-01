package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println( isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1,2020);
        getDaysInMonth(1,-2020);
	// write your code here
    }
    public static boolean isLeapYear(int year){
        if( year < 1 || year >9999){
            return false;
        }else if ( (year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            return true;
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month,int year){
        if(month < 1 || month>12 || year<1 || year>9999){
            System.out.println("invalid value");
            return-1;
        }
        switch(month){
            case 2:
                if(isLeapYear(year) == true){
                    return 29;
                }else{
                    return 28;
                }
            case 4:case 6:case 9:case 11:
                return 30;
            case 1:case 3:case 5:case 7:case 8 :case 10:case 12:
                return 31;
            default:
                System.out.println("invalid value");
                return -1;
        }
    }
}
