package com.company;

public class MissingNumber {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        System.out.println(findMissingNumbers(a));
    }

    public static int findMissingNumbers(int []num)
    {
        int n = num.length;
        int sum = ((n+1) *(n+2))/2;
        for (int i = 0;i<n;i++)
            sum -= num[i];
        return sum;
    }
}
