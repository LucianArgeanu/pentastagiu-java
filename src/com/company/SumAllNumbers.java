package com.company;

public class SumAllNumbers {

    public static void main(String[] args) {
       int number = 10;
       int sum = 0;
       for(int i = 0; i < number; i++){
           sum+= number;
       }
        System.out.println("Total sum: " + sum);
    }
}
