package com.company;

public class Main {

    public static void main(String[] args) {

        boolean GameOver = true;
        int Score = 800;
        int LevelCompileted = 5;
        int bonus = 100;

        if(GameOver){
            int FinalScore = Score + (LevelCompileted * bonus);
            System.out.println("the Final score is " + FinalScore);
        }

        boolean NewGameOver = true;
        int Score2 = 10000;
        int LevelCompileted2 = 8;
        int bonus2 = 200;
        if(NewGameOver){
            int FinalScore = Score2 + (LevelCompileted2 * bonus2);
            System.out.println("the Final 2 score is " + FinalScore);
        }
         Score2 = 10000;
         LevelCompileted2 = 8;
         bonus2 = 200;
        if(NewGameOver){
            int FinalScore = Score2 + (LevelCompileted2 * bonus2);
            System.out.println("the Final 2 score is " + FinalScore);
        }
	// write your code here
    }
}
