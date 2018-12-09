package com.company;

public class EvenOddNumber {
    public static void main(String[] args) {
        int[] Array = {13,20,14,5,2,8};

        int oddCount = 0;
        int evenCount = 0;

        for(int i = 0; i < Array.length; i++){
            if(Array[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Odd elements count: " + oddCount);
        System.out.println("Even elements count: " + evenCount);
    }
}
