package com.company;

import javax.swing.text.Position;

public class Main {

    public static void main(String[] args) {

//        CalcuolateScore(true,800,5,100);
//        CalcuolateScore(false,800,5,100);



        int FinalScore = calculateHighScorePosition(1500);
         disPlayHighScorePosition("Tom",FinalScore);

        FinalScore = calculateHighScorePosition(900);
        disPlayHighScorePosition("Bob",FinalScore);

        FinalScore = calculateHighScorePosition(400);
        disPlayHighScorePosition("Ali",FinalScore);

        FinalScore = calculateHighScorePosition(50);
        disPlayHighScorePosition("Ahmed",FinalScore);


	// write your code here
    }

//    public static int CalcuolateScore(boolean GameOver, int Score, int levelOfScore, int Bonus) {
//        if(GameOver) {
//            int FinalScore = Score + (levelOfScore * Bonus);
//            FinalScore += 1000;
//            System.out.println("The Final Score is = " + FinalScore);
//            return 0;
//        }
//        System.out.println("Got a Score");
//        return -1;
//    }



    public static void disPlayHighScorePosition(String name, int position){


        System.out.println(" Your name is " + name + " Your Position is " + position);

    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
//            System.out.println("Your Score was " + score);
            return 1;
        }else if (score >=500  ){
//            System.out.println("Your Score was " + score);
            return 2;
        }else if (score >=100 ){
//            System.out.println("Your Score was " + score );
            return 3;
        }
        return 4;
    }

}
