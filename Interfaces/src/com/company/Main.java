package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Test t= new My();
        t.meth1();
        t.meth2();
    }
}

interface Test{
    void meth1();
    void meth2();
}
class My implements Test{
    public void meth1(){
        System.out.println("Meth1 of class my");
    }
    public void meth2(){
        System.out.println("Meth2 of class my"); 
    }
    public void meth3(){
        System.out.println("Meth 3 of class my");
    }
}
