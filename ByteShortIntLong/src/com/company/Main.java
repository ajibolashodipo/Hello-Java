package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue= 10000;
        //how to determine a range of a primitive type

        //underflow
        int myMinIntValue= Integer.MIN_VALUE-1;
        //overflow
        int myMaxIntValue= Integer.MAX_VALUE+1;
        System.out.println("minimum integer" + myMinIntValue);
        System.out.println("maximum integer" + myMaxIntValue);


        //byte
        byte myMinByteValue= Byte.MIN_VALUE;
        byte myMaxByteValue= Byte.MAX_VALUE;

        System.out.println("minimum byte" + myMinByteValue);
        System.out.println("maximum byte" + myMaxByteValue);


        //short
        short myMinShortValue= Short.MIN_VALUE;
        short myMaxShortValue= Short.MAX_VALUE;

        System.out.println("minimum short" + myMinShortValue);
        System.out.println("maximum short" + myMaxShortValue);

        //long. 64 BIT. 2^63
        long myLongValue= 100L;
        long myMinLongValue= Long.MIN_VALUE;
        long myMaxLongValue= Long.MAX_VALUE;

        System.out.println("minimum long" + myMinLongValue);
        System.out.println("maximum long" + myMaxLongValue);


        int myTotal =(myMinIntValue/2);
        byte myNewByteValue= (byte)(myMinByteValue/2);

        //challenge
        byte myPracticeByte= 100;
        short myPracticeShort= 200;
        int myPracticeInt= 500;
        long myPracticeLong= (long)(50000+10*(myPracticeByte+ myPracticeShort + myPracticeInt));
        //long happily accepts int. so we don't have to type cast

        System.out.println(myPracticeLong);
    }
}
