package com.company;

import java.util.Arrays;

public class ArrayReverse {
    public int[] reverse(int  [] array)
    {
        if (array == null || array.length <= 1)
        {
            System.out.println("Invalid array.");
        }
        for (int i = 0; i< array.length / 2; i++){
            int temp = array[i];
            array[i]  = array[array.length -1 - i];
            array[array.length -1-i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayReverse arrayReverse = new ArrayReverse();
        int[] input = {1,2,3,4,5,6,7,8};
        System.out.println("Original Array is "+ Arrays.toString(input));
        System.out.println("Reversed Array is "+ Arrays.toString(arrayReverse.reverse(input)));
    }
}
