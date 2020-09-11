package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if((i+j)>5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int k=2; k<=i; k++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
