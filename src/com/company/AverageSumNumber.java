package com.company;

public class AverageSumNumber {
    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 100;
        double sum = 0;
        double totalSumAverage;

        for(int i = firstNumber; i <= secondNumber; i++){
            sum+=i;
        }

        totalSumAverage = sum / (secondNumber - firstNumber);
        System.out.println("Sum for range " + firstNumber + " to " + secondNumber + " : " + sum);
        System.out.println("Average for  range " + firstNumber + " to " + secondNumber + " : " + totalSumAverage);
    }
}
