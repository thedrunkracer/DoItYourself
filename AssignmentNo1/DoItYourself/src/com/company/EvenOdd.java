package com.company;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a%2 ==0){
            System.out.println("The given number is Even Number");
        }
        else {
            System.out.println("The given number is Odd Number ");
        }
    }
}
