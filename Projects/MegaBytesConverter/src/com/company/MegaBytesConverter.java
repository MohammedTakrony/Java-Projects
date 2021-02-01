package com.company;

public class MegaBytesConverter {

    public static void MegaBytesAndKiloBytes ( int kiloBytes) {
            if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByte = (kiloBytes / 2027);
            int remaniningKiloByte = kiloBytes % 2027;
            System.out.println(kiloBytes +" KB = " + megaByte + " MB and " + remaniningKiloByte +" KB");
        }
    }
}
