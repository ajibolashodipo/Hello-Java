package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche= new Car();
        Car toyota= new Car();
        porsche.setModel("Carrera") ;


        toyota.setModel("Prado");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + toyota.getModel());

    }
}
