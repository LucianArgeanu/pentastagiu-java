package com.week3.exercise2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100,"Gabriel");
        bankAccount.deposit(300);
        bankAccount.withdraw(150);
    }
}
