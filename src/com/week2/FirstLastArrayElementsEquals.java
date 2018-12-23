package com.week2;

public class FirstLastArrayElementsEquals {
    public static void main(String[] args) {

        int[] firstArray = {13,6,2,8,2,3};
        int[] secondArray = {13,6,2,8,2,13};

        System.out.println(compare(firstArray));
        System.out.println(compare(secondArray));

    }

    public static boolean compare(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[0] != array[array.length - 1]){
                return false;
            }
        }
        return true;
    }
}
