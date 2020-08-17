package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        System.out.println("Begin by typing the count you desire: \r");
        int myCount=scanner.nextInt();
        scanner.nextLine();
       int [] integerArray= readIntegers(myCount);
       int myMin= findMin(integerArray);
        System.out.println("minimum number is " + myMin);

    }

    public static int[] readIntegers(int count){
        System.out.println("Please Enter "+ count+ " numbers: ");
        //initialize array
        int[] array= new int[count];
        //loop
        for(int i=0; i<count; i++){
            array[i]= scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] myArray){
        //traverse the array
        int min= myArray[0];
        for (int i=1; i< myArray.length; i++){
            if(myArray[i]<min){
                min= myArray[i];
            }
        }
        return min;
    }
}
