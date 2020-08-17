package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount jibola= new BankAccount(123445, 50000, "Ajibola Shodipo", "shodipoajibola@gmail.com", 23443432);

        jibola.addFunds(70000);
        System.out.println(jibola.getBalance());
        jibola.withdrawFunds(120000);
        System.out.println(jibola.getBalance());
    }
}
