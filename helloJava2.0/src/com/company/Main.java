package com.company;

public class Main {

    public static void main(String[] args) {
	// swapping values with XOR
         int a=10;
         int b=15;
         float g= 12.44;
         a= a^b;
         b=a^b;
         a=a^b;
        System.out.println( a + " " + b);
    }
}
