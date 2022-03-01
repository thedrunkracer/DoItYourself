package com.company;

public class SwapString {
    public static void main(String[] args) {

        String str1 = "Web";
        String str2 = "Programming";
        System.out.println("Given strings are ==>" + str1 + " " + str2);
        str1=str1+str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping==> " + str1 + " " + str2);
    }
}
