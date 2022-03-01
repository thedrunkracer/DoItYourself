package com.company;

public class SecondLargest_Number {
    public static void main(String[] args) {
        int a [] = {23,14,55,63,12,32,12,13};
        System.out.println("Second Largest " + getSecondLargest(a,8));
    }

    public static int getSecondLargest(int[] a, int total){
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
        return a[total-2];
    }
}
