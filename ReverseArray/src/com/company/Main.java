package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []yourArray= {1,2,3,4,5};
        reverse(yourArray);
    }

    private static void reverse(int[] array){ 
        int []reverseArray= new int [array.length];
        int j= array.length-1;
        //loop
        for(int i=0; i<array.length;i++){

            reverseArray[i]=array[j];
            j--;
        }
        System.out.println("normal array= "+ Arrays.toString(array));
        System.out.println("reverse array= "+ Arrays.toString(reverseArray));
    }
}
