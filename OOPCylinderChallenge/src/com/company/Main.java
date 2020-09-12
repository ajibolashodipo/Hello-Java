package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Cylinder{
    private double radius;
    private double height;

    //constructor
    public Cylinder(){
    height=0;
    radius=0;
    }
    public Cylinder(double r){
        height=1;
    }
    public Cylinder(double r, double h){

    }
    //getters and setters
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public void setRadius(double r){
        if(r<0){
            radius= 0;
        }else{
            radius= r;
        }

    }
    public void setHeight(double h){
        if(h<0){
            height= 0;
        }else{
            height= h;
        }
    }
    public void setDimensions( double r, double h){
            height= h;
            radius=r;
    }

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