package com.week2;

public class DuplicateLetterSymbol {
    public static void main(String[] args) {
        String myString = "Hello world";
        char symbol = '#';
          for(int i = 0; i < myString.length(); i++){
              char ch1 = myString.charAt(i);
              char ch2 = myString.charAt(i++);

              if(ch1 == ch2){
               myString.replace(ch1,symbol);
              }
          }
        System.out.println(myString);



    }
}
