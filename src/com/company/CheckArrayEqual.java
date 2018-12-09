package com.company;

public class CheckArrayEqual {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4};
        int[] secondArray = {1,2,3,4};
        int[] thirdArray = {1,3};

        System.out.println(compareArray(firstArray,secondArray));
        System.out.println(compareArray(firstArray,thirdArray));
    }

    public static boolean compareArray(int[] first, int[] second){
        if(first.length != second.length){
            return false;
        }
        for(int i = 0; i < first.length; i++){
            if(first[i] != second[i]){
                return false;
            }
        }
        return true;
    }

}
