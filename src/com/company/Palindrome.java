package com.company;

public class Palindrome {
    public static void main(String[] args) {
        String firstString = "aaabccbaaa";
        String secondString = "abccbb";


        System.out.println(istPalindrom(firstString));
        System.out.println(istPalindrom(secondString));
    }

    public static boolean istPalindrom(String myArray){
        int start = 0;
        int end = myArray.length() - 1;
        while (end > start) {
            if (myArray.charAt(start) != myArray.charAt(end)) {
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }
}
