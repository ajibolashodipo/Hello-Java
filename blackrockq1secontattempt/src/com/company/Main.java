package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String [][] moneyArray= new String[][]{{"50.0", "Fifty Pounds"},{"20.0", "Twenty Pounds"},{"10.0", "Ten Pounds"},
                                                {"5.0", "Five Pounds"},{"2.0", "Two Pounds"},{"1.0", "One Pound"},{"0.50", "Fifty Pence"},
                                                {"0.20", "Twenty Pence"},{"0.10", "Ten Pence"},{"0.05", "Five Pence"},{"0.02", "Two Pence"},{"0.01", "One Pence"}};
        double cash= 150;
        double purchasePrice= 16.76;
        ArrayList<String> Result = new ArrayList<String>();
        int count= 0;

        double difference= cash- purchasePrice;

        outerloop:
        for (int i=0; i< moneyArray.length; i++){
            double conv= Double.parseDouble(moneyArray[i][0]);
            while(difference>= conv){
                System.out.println(difference);
                difference -=conv;
                double temp= Math.round(difference*100.0)/100.0;
                difference= temp;

              Result.add(moneyArray[i][1]);

              if(difference==0){
                  break outerloop;
              }
            }
        }
        System.out.println(Arrays.toString(Result.toArray()));
    }
}












//class Money{
//    double value;
//    String name;
//
//    public Money(Double x, String s){
//        value= x;
//        name= s;
//    }
//}