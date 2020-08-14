package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double solution= calcFeetAndInchesToCentimeters(156);

        double myFinal= calcFeetAndInchesToCentimeters(solution, 1);
        System.out.println(myFinal);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0 || inches <0) || inches>12){
            return -1;
        }
        double centimeters= (12*2.54*feet)+(2.54*inches);

        return centimeters;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <0){
            return -1;
        }
        double feet= (int) inches/12;

        return feet;

    }


}
