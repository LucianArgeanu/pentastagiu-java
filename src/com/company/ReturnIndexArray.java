package com.company;

public class ReturnIndexArray {
    public static void main(String[] args) {
        int[] myArray = {13,20,14,5,2,8};
        int target = 5;
        for(int i = 0 ; i < myArray.length; i++){
            if(target == myArray[i]){
                System.out.println(i);
            }
        }

    }
}
