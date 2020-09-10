package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        matchBenchmark("Vodafone,STOCK,10|Vodafone,BOND,10|Google,STOCK,15:Vodafone,STOCK,15|Vodafone,BOND,10|Google,STOCK,10");

    }

    public static void matchBenchmark(String input){
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        //split the string with :
        String [] splitString= input.split(":");
//      System.out.println(Arrays.toString(splitString));

        //split individual elements on basis of "|"
        String[] portfolioString= splitString[0].split("\\|");
        String[] benchmarkString= splitString[1].split("\\|");

        //sort the array
        Arrays.sort(portfolioString);
        Arrays.sort(benchmarkString);
       System.out.println(Arrays.toString(portfolioString));
       System.out.println(Arrays.toString(benchmarkString));


        for (bench:
             ) {
            
        }























//      for(String el:portfolioString){
//          String[] myString= el.split(",");
//            a1.add(myString[0]);
//            a1.add(myString[1]);
//            a1.add(myString[2]);
//          System.out.println(a1);
//            aList.add(a1);
//          System.out.println(aList);
////            a1.clear();
//      }
//        System.out.println("ahmed");
//        for (int i = 0; i < aList.size(); i++) {
//            for (int j = 0; j < aList.get(i).size(); j++) {
//                System.out.print(aList.get(i).get(j) + " ");
//            }
//            System.out.println();
//
//        }
//        System.out.println(aList);




        //System.out.println(Arrays.deepToString(aList));

            //traverse the benchmark array

        //case1: same length and same portfolio
//        if(portfolioString.length== benchmarkString.length){
//            for(let i=0)
//        }


    }
}
