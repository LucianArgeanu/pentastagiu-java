package com.company;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4};
        int[] secondArray = {5,6,7,8};
        int resultArray[] = new int[firstArray.length + secondArray.length];

        int count = 0;
        for(int i = 0; i < firstArray.length; i++ ){
            resultArray[i] = firstArray[i];
            count++;
        }

        for(int j = 0; j < secondArray.length; j++ ){
            resultArray[count] = secondArray[j];
            count++;
        }
        System.out.print("Result: ");
        for(int k = 0; k <resultArray.length; k++){
            System.out.print(resultArray[k] + " ");
        }
    }
}
