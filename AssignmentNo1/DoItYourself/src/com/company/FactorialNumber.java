package com.company;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int fact= 1;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number for Factorization ");
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println("The factorial of "+a +" is "+fact);
    }
}
