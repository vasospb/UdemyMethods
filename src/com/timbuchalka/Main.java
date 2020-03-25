package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        Car porche = new Car();
        Car holden = new Car();

        porche.setModel("Porsche");
        System.out.println(porche.getModel());
//
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//        displayHighScorePosition("Vaso", calculateHighScorePosition(1000));
//        displayHighScorePosition("Tim", calculateHighScorePosition(900));
//        displayHighScorePosition("Percy", calculateHighScorePosition(400));
//        displayHighScorePosition("Gilbert", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playername, int position){
        System.out.println("Player: " + playername + " managed to get " + position +
                " position on the high score table.");

    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if (score >= 1000)
            position = 1;
        else if (score >= 500)
            position = 2;
        else if (score >= 100)
            position = 3;

        return position;
        }

}
