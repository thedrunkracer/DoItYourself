package com.company;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("The number is negative");
        }
        else
            System.out.println("The number is positive");
    }
}
