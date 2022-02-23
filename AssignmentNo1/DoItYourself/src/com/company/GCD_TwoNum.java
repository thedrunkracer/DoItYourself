package com.company;

import java.util.Scanner;

//using while loop
public class GCD_TwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a!=b){
            if(a>b)
                a = a-b;
            else
                b =b-a;
        }
        System.out.println("GCD of a and b is " +b);
    }
}
