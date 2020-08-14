package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        isNumberPrime();
        sumThreeAndFive();
    }

    public static void isNumberPrime(){
        for (int i=1; i<=30; i++){
            if(i==1){
                System.out.println("Move along");
            }
            //check for 2 and other odd numbers
         else if ( i==2 || i%2 !=0){
                int count=0;
                for(int j=1 ;j<=Math.sqrt(i); j++){
                    //check for remainders
                    if(i%j==0){
                        count++;
                    }
                }
                if (count==1){
                    System.out.println(i+ " is a prime number");
                }
            }
        }
    }

    public static void sumThreeAndFive(){
        int count=0;
        int mySum=0;
        for(int i=1; i<=1000; i++){
            if (i%3==0 && i%5==0){
                System.out.println(i+ " is divisible by both 3 and 5");
                mySum +=i;
                count++;
            }
            if(count==5){
                break;
            }
        }
        System.out.println("The sum of these numbers is "+ mySum);
    }
}
