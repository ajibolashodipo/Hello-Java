package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle r= new Rectangle();
        r.length= 5;
        r.breadth= 5;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
    }
}

class Rectangle{
    public double length;
    public double breadth;

    public double area(){
       return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}