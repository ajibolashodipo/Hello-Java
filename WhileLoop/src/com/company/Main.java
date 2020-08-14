package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int mySum= digitSumChallenge(-12805);
        System.out.println("Sum of the digits is "+ mySum);
    }

    public static int digitSumChallenge(int n){
        if (n<10){
            return -1;
        }
        int sumDigits= 0;
        int unitDigit;

        while(n>0){
            unitDigit= n%10;
            sumDigits += unitDigit;
            n= n/10;
        }

//        while(n>=10){
//            unitDigit= n%10;
//            sumDigits += unitDigit;
//            n= n/10;
//        }
//        sumDigits +=n;

//        OR

        return sumDigits;
    }
}
