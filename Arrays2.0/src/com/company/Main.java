package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int A[]= new int[10];
        int B[]= {9,34,65,12,8,54,98,1,56,22,99};
        
     //FIND Second largest element
        int max1= B[0];
        int max2= B[0];

        for (int i=0; i<B.length; i++){
            if (B[i] >max1){
                max2= max1;
                max1= B[i];
            }else if (B[i]>max2){
                max2= B[i];
            }
        }
//        System.out.println("max= "+ max1+ "second= "+ max2);

        //creating a jagged array
        int D[][];
        D=  new int[3][];
        D[0]=new int[2];
        D[1]=new int[5];
        D[2]=new int[8];

        for (int x[]:D){
            for (int y:x){
                System.out.print(y);
            }
            System.out.println("");
        }






    }
}
