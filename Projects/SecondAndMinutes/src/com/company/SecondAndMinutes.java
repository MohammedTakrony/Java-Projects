package com.company;

public class SecondAndMinutes {
    public static String getDurationString (int min, int sec) {
        if ((min < 0) || (sec < 0) || (sec > 59)) {
//
            return "Invalid value";
        }
        int hour = (min/60) ;
        min = min %60;

        return "Time is " + hour+ "h " + min + "m "+ sec + "s ";
    }
    public static String getDurationString (int sec){
        if (sec <0){

            return "Invalid value";
        }

        int min = sec/60;
        sec = sec % 60;

        return getDurationString(min, sec);

    }


}
