package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ant year");
        year = sc.nextInt();
        if(((year%4 ==0)&&(year%100 !=0))|| (year%400 ==0)){
            System.out.println("This is a Leap year");
        }
        else
            System.out.println("This is not a Leap year");
    }
}
