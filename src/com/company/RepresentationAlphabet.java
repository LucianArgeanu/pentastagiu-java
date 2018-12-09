package com.company;

public class RepresentationAlphabet {
    public static void main(String[] args) {
        String myString = "abcd";
        char[] ch  = myString.toCharArray();
        for(char c : ch)
        {
            int temp = (int)c;
            int temp_integer = 97; //for lower case
            if(temp<=122 & temp>=97)
                System.out.print(temp-temp_integer);
        }
    }
}
