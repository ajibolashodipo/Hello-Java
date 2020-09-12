package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle r= new Rectangle(6,6);
//        r.setLength(5);
//        r.setBreadth(5);

        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());


        Cylinder c= new Cylinder();
        c.radius= 5;
        c.height= 6;
        System.out.println(c.totalSurfaceArea());
    }
}

class Rectangle{
    private double length;
    private double breadth;

    //constructor
    public Rectangle(){
        length=1;
        breadth=2;
    }
    public Rectangle(double l, double b){
        length=l;
        breadth=b;
    }

    //getter and setters
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }

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

class Cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return  Math.PI* radius*radius;
    }
    public double totalSurfaceArea(){
        return 2* lidArea() + circumference()*height;
    }
    public double volume(){
        return  lidArea() * height;
    }
    public double circumference(){
        return 2* Math.PI* radius;
    }
}