package com.company;

public class Digits_Number {
    public static void main(String[] args) {
        int number  = 20323203;
         String string_number = Integer.toString(number);
         for (int i =0;i<string_number.length();i++){
             System.out.println(string_number.charAt(i));
         }
    }
}
