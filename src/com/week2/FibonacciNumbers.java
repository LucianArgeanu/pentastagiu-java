package com.week2;

public class FibonacciNumbers {
    public static void main(String[] args) {

        int number = 20;
        fibonacciMethod(number);

    }

    public static void fibonacciMethod(int number){

        int firstVariable = 0;
        int secondVariable = 1;
        int fibonacciNumber = 0;
        double sum = 0;

        System.out.println("The first "+ number + " numbers are:");
        for(int i = 0; i < number; i++){

            fibonacciNumber = firstVariable + secondVariable;
            firstVariable = secondVariable;
            secondVariable = fibonacciNumber;
            System.out.print(firstVariable + " ");
            sum+=firstVariable;

        }

        System.out.println("\nThe average is " + sum/number);
    }
}
