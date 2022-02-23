package com.company;

public class LCM_TwoNumUsingFactors {
    public static void main(String[] args) {
        int a = 24, b =12, gcd = 1;

        for (int i = 1;i<=a && i<=b; i++){
            if (a%i == 0 && b%i == 0)
                gcd =i;
        }
        int lcm = (a*b)/ gcd;

        System.out.println("The LCM of "+a+" and "+b+" is "+lcm);
    }
}
