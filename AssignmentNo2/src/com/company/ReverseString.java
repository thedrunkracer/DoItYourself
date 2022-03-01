package com.company;

import java.util.Scanner;

public class ReverseString {

    public void stringReverse(String n)
    {
        System.out.println("The Reversed string is");
        for(int i=n.length();i>0;i--)
        {
            System.out.print(n.charAt(i-1));

        }
    }



    public static void main(String args[])
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Please enter the string");
        String str=s1.nextLine();
        ReverseString ob1 = new ReverseString();
        ob1.stringReverse(str);
    }
}
