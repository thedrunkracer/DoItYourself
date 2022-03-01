package com.company;

import java.util.HashMap;
import java.util.Map;

public class Union_UnsortedArrays {

    static void printUnion(int [] a, int n, int[] b, int m)
    {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for (int i = 0; i<n; i++){
            mp.put(a[i], i);
        }
        for (int i = 0;i < m; i++)
        {
            mp.put(b[i], i);
        }

        System.out.println("The union set of both arrays is : ");
        for (Map.Entry mapElement : mp.entrySet())
        {
            System.out.println(mapElement.getKey() + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6,2,3,5};
        int b[] = {2,4,5,6,8,4,9,6,5};

        printUnion(a,8,b,9);
    }
}
