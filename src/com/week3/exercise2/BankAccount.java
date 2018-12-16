package com.week3.exercise2;

public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
        System.out.println(name + " has : " + balance + " funds in his current account.");
    }

    public void withdraw(double value){
       if(value > balance){
           System.out.println("You have insufficient funds.");
       }else{
           balance -= value;
           System.out.println("The withdraw operation was succesful. Your current balance: " + balance);
       }
    }

    public void deposit(double value){
        if(balance > 0){
            System.out.println("Adding funds to the current account");
            balance += value;
            System.out.println("The deposit operation was succesful. Your current balance: " + balance);
        }else{
            System.out.println("The deposit operation failed.");
        }
    }
}
