package com.company;

public class playingCat {
    public static boolean isCatPlaying (boolean summer, double temperature){
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        }
      else if (temperature >=25 && temperature <=35 ){
          return true ;
      }
        return false;
    }

    }


