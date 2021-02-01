package com.company;

public class BarkingDog {
    public static boolean shouldWakeUP(boolean Barking, int HourOfDay ){

        if(!Barking || (HourOfDay < 0 || HourOfDay > 24)){
            return false;
        }
        else if (Barking && (HourOfDay < 8 || HourOfDay > 22)){

            return true ;
            }
            return false;
        }
    }

