 package com.company;

public class Car {
    //fields
    private  int doors;
    private int wheels;
    private String model;
    public String engine;
    private String colour;
    
    //creating a public method
    public void setModel(String model){
        String validModel= model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("prado")){
            this.model= model;
        }else{
            this.model= "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }


}
