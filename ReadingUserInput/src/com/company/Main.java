package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //initialize scanner
        Scanner scanner= new Scanner(System.in);
        //input
        System.out.println("Enter your year of birth: ");

        //checks for integer user input. returns true if next input is indeed an integer
        boolean hasNextInt= scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth= scanner.nextInt();

            scanner.nextLine(); //handles next line character (enter key)

            System.out.println("Enter your name: ");
            String name= scanner.nextLine();

            int age= 2020- yearOfBirth;

            //validation against negative numbers
            if(age>=0){
                System.out.println("Your name is "+ name + ", and you are "+ age+" years old alaye");
            }else{
                System.out.println("Unable to parse year of birth");
            }



        }

        scanner.close();
    }
}
