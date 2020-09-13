package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c = new Circle();
        c.radius= 5;
        System.out.println(c.area());

        Rectangle r= new Rectangle();
        r.length= 5;
        r.breadth=10;
        System.out.println(r.area());
//        Shape s= new Shape();
    }
}

abstract class Shape{

    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape{
    public int radius;

    public double perimeter(){
        return Math.PI * 2* radius;
    }
    public double area(){
        return Math.PI *radius * radius;
    }


}

class Rectangle extends Shape{
    public int length;
    public int breadth;

    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}