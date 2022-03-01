package com.company;
//Average of given array
public class Average_Array {
    public static void main(String[] args) {
        double [] arr1  = {12,24,43,53,23,43,16};
        double total = 0;

        for (int i = 0;i<arr1.length;i++){
            total = total + arr1[i];
        }
        double average = total/arr1.length;

        System.out.println("The average is "+ average);
    }

}
