package com.week2;

public class MinMaxAverage {
    public static void main(String[] args) {
        int[] myArray = {13,20,14,5,2,8};

        //max
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< myArray.length; i++){
           if(myArray[i] > max){
               max = myArray[i];
           }
        }

        //min
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< myArray.length; i++){
            if(myArray[i] < min){
                min = myArray[i];
            }
        }

        //average
        double sum = 0;
        double average = 0;
        for(int i = 0; i< myArray.length; i++){


            sum+=myArray[i];
            average = sum / myArray.length;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.print("Average: ");
        System.out.format("%.1f", average);
    }
}
