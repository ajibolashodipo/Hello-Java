package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// reverse a number. should account for tailing zeros as well
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num= sc.nextInt();
        int originalNum= num;
        int rev=0;
        String revStr= "";
        String numberToWords="";
        //reverse the number using a string
        while (num>0){
            int lastDigit= num%10;
            revStr +=lastDigit;
            num= num/10;
        }
        //traverse the string
        for (int i=revStr.length()-1; i>=0; i--){
           char myNum= revStr.charAt(i) ;

           switch (myNum){
               case '0':
                   numberToWords += "zero ";
                   break;
               case '1':
                   numberToWords += "one ";
                   break;
               case '2':
                   numberToWords += "two ";
                   break;
               case '3':
                   numberToWords += "three ";
                   break;
               case '4':
                   numberToWords += "four ";
                   break;
               case '5':
                   numberToWords += "five ";
                   break;
               case '6':
                   numberToWords += "six ";
                   break;
               case '7':
                   numberToWords += "seven ";
                   break;
               case '8':
                   numberToWords += "eight ";
                   break;
               case '9':
                   numberToWords += "nine ";
                   break;
           }
        }
        System.out.println(originalNum + "="+ numberToWords);
    }
}
