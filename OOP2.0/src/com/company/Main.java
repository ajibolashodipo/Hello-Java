package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1= new Circle();
        Circle c2= new Circle();
        c1.radius= 7;
        c2.radius= 10;

        System.out.println(c1.area());
        System.out.println(c2 .area());
    }
}


class Circle{
    public double radius;
    public double area(){
        return Math.PI* radius * radius;
    }
}