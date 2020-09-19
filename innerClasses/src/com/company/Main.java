package com.company;

abstract  class My{
    abstract public void show();
} 




class Outer{
    public void display(){
        class Inner{
            public void show(){
                System.out.println("hELLO");
            }
        }
//        Inner i= new Inner();
//        i.show();
        //this also works
        new Inner().show();
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        Outer o= new Outer();
        o.display();
    }
}
