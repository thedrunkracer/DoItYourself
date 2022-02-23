package com.company;

import java.util.Scanner;

public class Factorial_Recursion {

    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }
    public static void main(String[] args) {
        int i, fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorization");
        int a  = sc.nextInt();
        fact = factorial(a);
        System.out.println("The factorial of "+a +" is "+fact);
    }
}
