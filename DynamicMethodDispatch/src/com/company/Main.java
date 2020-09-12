package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car c= new LuxuryCar();

        c.changeGear();

    }
}

class Car{
    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear Changed");
    }
}

class LuxuryCar extends Car{
    public void changeGear(){
        System.out.println("automatic gear");
    }
    public void openRoof(){
        System.out.println("sun roof is opened");
    }
}