package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double cash= 50;
        double purchasePrice= 11.75;
        double[] doubleArray = new double[]{ 50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01 };
        ArrayList<Double> myTemp = new ArrayList<Double>();
        int count= 0;


        double difference= cash- purchasePrice;

        while (difference != 0){
            //traverse the list
            for(int i=0; i< doubleArray.length-1; i++){
                if(difference< doubleArray[i] && difference>= doubleArray[i+1]){
                    count++;
                    difference -=doubleArray[i+1];


                    //add count index to array list
                    myTemp.add(doubleArray[count]);
//                    System.out.println(difference);
                    System.out.println(doubleArray[i+1]);
                }
            }
        }
        System.out.println(difference);
        System.out.println(myTemp);

    }
}
