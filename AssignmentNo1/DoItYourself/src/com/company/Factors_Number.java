package com.company;

import java.util.Scanner;

//Factors of given number
public class Factors_Number {

    static void printFactors(int n){
        for (int i=1;i<=n;i++)
            if(n%i==0)
                System.out.println(i+" ");
                }
    public static void main(String[] args) {

        System.out.println("The factors of the given number is");
        printFactors(50);
    }
}
