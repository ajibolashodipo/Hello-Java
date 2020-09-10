package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num= sc.nextInt();
        int rev=0;

        while (num>0){
            int lastDigit= num%10;
            rev= rev*10 +lastDigit;
            num= num/10;
        }
        System.out.println(rev);
    }
}
