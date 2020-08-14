package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int showScore= displayHighScorePosition(1500);
        System.out.println(showScore);
        showScore= displayHighScorePosition(900);
        System.out.println(showScore);
        showScore= displayHighScorePosition(400);
        System.out.println(showScore);
        showScore= displayHighScorePosition(50);
        System.out.println(showScore);
    }
    public static int displayHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }
        else if(playerScore>=500){ 
            return 2;
        }
        else if(playerScore>=100){
            return 3;
        }
            return 4;
    }
}







