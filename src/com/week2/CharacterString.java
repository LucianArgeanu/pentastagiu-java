package com.week2;

public class CharacterString {
    public static void main(String[] args) {
        String firstString = "Hello java world";
        char character = 'a';

        countChar(firstString,character);

    }

    public static void countChar(String str, char c)
    {
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }
        System.out.println(count);
    }
}
