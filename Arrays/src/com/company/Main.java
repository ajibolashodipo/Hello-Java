package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
	// write your code here
    int [] myIntegers= getIntegers(5);
    printArray(myIntegers);

    }

     public static int[] getIntegers(int capacity){
        int [] array= new int[capacity];
         System.out.println("Enter" + capacity+ " integer values: \r");
         for(int i=0; i<array.length; i++){
             array[i]= scanner.nextInt();
         }
         return array;
     }
     public static void printArray(int []myArray){
        for (int i=0; i< myArray.length; i++){
            System.out.println("array element "+ i + "=" + myArray[i]);
        }
     }

//     public static int[] sortIntegers(int[] array){
//        int [] sortedArray= new int [array.length];
//        for(int i=0; i<array.length; i++){
//            sortedArray[i]= array[i];
//        }
//
//        boolean flag= true;
//        int temp;
//        while(flag){
//            flag= false;
//        }
//     }
}
