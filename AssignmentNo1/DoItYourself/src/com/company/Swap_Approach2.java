package com.company;
//Using Bitwise XOR
public class Swap_Approach2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping : "+" a= "+ a +", b="+b);
    }
}
