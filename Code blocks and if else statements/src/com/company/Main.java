package com.company;

public class Main {

    public static void main(String[] args)
    {
//        int score=10000;
//        int lvlCompleted=8;
//        int bonus=200;
//        boolean gameOver=true;
//        int highScore=calculateScore(gameOver,score,lvlCompleted,bonus);
//        System.out.println("Your final score was: "+highScore);
//
//
//
//        score=800;
//        lvlCompleted=5;
//        bonus=100;
//
//        highScore=calculateScore(gameOver,score,lvlCompleted,bonus);
//        System.out.println("Your final score was: "+highScore);

        int score=1500;
        String name="George";
        int positionOfPlayer=calculateHighScorePosition(score);
        displayHighScore(name,positionOfPlayer);

        score=900;
        name="Peter";
        positionOfPlayer=calculateHighScorePosition(score);
        displayHighScore(name,positionOfPlayer);

        score=400;
        name="Jane";
        positionOfPlayer=calculateHighScorePosition(score);
        displayHighScore(name,positionOfPlayer);

        score=50;
        name="Brendan";
        positionOfPlayer=calculateHighScorePosition(score);
        displayHighScore(name,positionOfPlayer);
    }

    public static int calculateScore(boolean gameOver,int score,int lvlCompleted,int bonus)
    {
        if(gameOver)
        {
            int finalScore=score+(lvlCompleted*bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScore(String name,int scorePosition)
    {
        System.out.println("Congrats "+name+" you are number "+scorePosition+" on the leaderboard");
    }

    public static int calculateHighScorePosition(int playerScore)
    {

        int position=4;

        if(playerScore>=1000)
        {
            position=1;
        }
        else if(playerScore>=500)
        {
            position=2;
        }
        else if(playerScore>=100);
        {
            position=3;
        }

        return position;
//        if(playerScore>=1000)
//        {
//            return 1;
//        }
//        else if(playerScore>=500)
//        {
//            return 2;
//        }
//        else if(playerScore>=100)
//        {
//            return 3;
//        }
//        else
//        {
//            return 4;
//        }
    }
}
