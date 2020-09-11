package com.company;

public class Main {

    public static void main(String ...args){
	// write your code here
        boolean result= isPrime(19);
        System.out.println(result);

    }

    //check if number is prime
    static boolean isPrime(int n){
        int count=0;
        for (int i=2; i<(n/2); i++){
            if(n%i ==0){
                System.out.println(n + " is not prime");
                return false;
            }
        }
        System.out.println(n +" is prime");
        return true;
    }


}
