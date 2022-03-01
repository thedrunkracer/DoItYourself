package com.company;

import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class MFE_Hashing {
    static int mostFrequent(int arr[], int n)
    {
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();

        for (int i = 0; i<n; i++)
        {
            int key = arr[i];
            if (hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
            }
            else
            {
                hp.put(key,1);
            }
        }

        int max_count = 0, res = -1;

        for (Map.Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = {1,5,4,3,2,1,3,1,1};
        int n = arr.length;

        System.out.println(mostFrequent(arr,n));
    }
}
