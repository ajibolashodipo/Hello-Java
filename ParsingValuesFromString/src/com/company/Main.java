package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString= "2018";
        numberAsString +=1;
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        number +=1;
        System.out.println("number= "+ number);
    }
}
