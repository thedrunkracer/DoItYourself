package com.company;

public class Swap_Approach3 {

    public static void swap(int a, int b){
        a = (a & b) + (a | b);

        b = a + (~b) + 1;

        a = a + (~b) + 1;

        System.out.println("After swapping : "+" a= "+ a +", b="+b);
     }
    public static void main(String[] args) {
        int a = 20, b = 15;

        swap(a,b);
    }
}
