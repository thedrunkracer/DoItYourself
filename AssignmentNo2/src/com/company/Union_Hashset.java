package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class Union_Hashset {
    public static void main(String[] args) {
        Integer[] arr1 = {0,2,4,6,8};
        Integer[] arr2 = {1,3,5,7,9};

        HashSet<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(arr1));

        set.addAll(Arrays.asList(arr2));

        System.out.println(set);

        Integer[] union = {};
        union = set.toArray(union);

        System.out.println(Arrays.toString(union));
    }
}
