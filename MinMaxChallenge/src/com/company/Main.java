package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int min=0;
        int max=0;
        int count=0;

        //check if input is valid
        while(true){
            //await user input
            System.out.println("Enter number: " );
            //check if integer is a true integer
            boolean isInteger= scanner.hasNextInt();
            if(isInteger){
                count++;
                //gets new user value
                int userInt= scanner.nextInt();
                //initializes min and max to the first user input
                if(count==1){
                   min= userInt;
                   max= userInt;
                }else{
                    //update min and max
                    if(userInt>max){
                        max= userInt;
                    }
                    if(userInt<min){
                        min= userInt;
                    }

                    //alternatively you can set min= LARGEST INT VALUE; MAX= SMALLEST MIN VALUE. 
                    //tHIS WAY YOU DO NOT NEED TO INITIALIZE min and max on line 26
                }

            }else{
                //print out min and max
                System.out.println("minimum: "+ min);
                System.out.println("maximum: "+ max);
                break;
            }
            //handles the enter keyword nextInt problem
            scanner.nextLine();
        }
      scanner.close();
    }
}
