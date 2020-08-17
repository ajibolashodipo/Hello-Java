package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email; 
    private int phoneNumber;

    //CONSTRUCTOR. called once at the start
//    public BankAccount(){
//        System.out.println("Empty constructor call");
//    }
    public BankAccount( int accountNumber, double balance, String customerName, String email, int phoneNumber){

            this.accountNumber = accountNumber;
            this.customerName = customerName;
            this.balance = balance;
            this.email = email;
            this.phoneNumber = phoneNumber;

    }

    //methods
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    //set methods

    public void addFunds(int funds){
        this.balance= this.balance + funds;
    }
    public void withdrawFunds(int funds){
        if(funds>this.balance){
            System.out.println("AlAYE YOU ARE BROKE. GET RICH");
        }else{
            this.balance= this.balance - funds; 
        }
        
    }
}

