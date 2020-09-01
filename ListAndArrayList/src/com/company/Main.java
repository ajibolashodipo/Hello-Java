package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String string = "I am a string. Yes I am";
        System.out.println(string);

        String yourString= string.replaceAll("I", "You");
        System.out.println(yourString);


        String alphaNumeric= "abcDee125609fdjkge";
        System.out.println(alphaNumeric.replaceAll(".", "Y"));

    }
}
 