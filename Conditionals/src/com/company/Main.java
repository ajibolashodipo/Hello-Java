package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean isAlien= false;
        if(!isAlien) {
            System.out.println("it is not an alien");
            System.out.println("it is not an alien");
        }

        int topScore=100;
        if(topScore==100){
            System.out.println("you got the high score");
        }

        //code challenge
        double var1= 20.00d;
        double var2= 80.00d;
        double var3= 100.00d*(var1+ var2);
        double remainder= var3%40.00d;
        boolean myBool= remainder==0?true:false;
        System.out.println(myBool);
        System.out.println(remainder);

        if(!myBool){
            System.out.println("got some remainder");
        }

    }
}
