package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms in the sequence:");

        int terms= sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if (terms==1){
            System.out.println(a);
        }
        else if (terms==2){
            System.out.println(b);
        }
        else{
            for(int i=2; i<=terms; i++){
                c= a+b;
                a=b;
                b=c;

            }
            System.out.println(c);
        }


    }
}
