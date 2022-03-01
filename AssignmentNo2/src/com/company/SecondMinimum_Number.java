package com.company;

public class SecondMinimum_Number {
    public static void main(String[] args) {
        int a [] = {23,14,55,63,11,32,10,13};
        System.out.println("Second Minimum " + getSecondMinimum(a,8));
    }
    public static int getSecondMinimum(int[] a, int total){
        int temp;
        for (int i = 0; i<total;i++)
        {
            for (int j = i+1;j<total;j++)
            {
                if (a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }

}
