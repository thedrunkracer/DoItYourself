package com.company;

public class MoveAllZeroToStart {
    static void printArr(int arr[], int n){
        for (int i = 0; i<n;i++)
        System.out.print(arr[i]+" ");
    }

    static void pushZeroToStart(int arr[], int n)
    {
        int count1 = 0;

        for (int i = 0; i<n;i++)
            if (arr[i] != 1)
                arr[count1++] = arr[i];

        while(count1 <n)
            arr[count1++] = 1;

        int lastNonone = 0;

        for (int i = n-1; i>= 0; i--)
        {
            if(arr[i] == 1)
                continue;
            if (lastNonone ==0)
            {
                lastNonone = i;
            }
            if (arr[i] != 0)
                arr[lastNonone--] = arr[i];
        }

        while(lastNonone >= 0)
            arr[lastNonone--] = 0;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,0,0,0,3,6};
        int n = arr.length;
        pushZeroToStart(arr,n);
        printArr(arr,n);
    }
}
