package com.company;

public class Intersection_TwoArrays {
    public static void main(String[] args) {
        int myArray1[] = {23,45,27,57,78,45,54};
        int myArray2[] = {90,76,32,54,21,27,78};
        System.out.println("Intersection of the two Arrays");

        for (int i = 0; i<myArray1.length; i++){
            for (int j = 0; j<myArray2.length; j++){
                if (myArray1[i]==myArray2[j]){
                    System.out.println(myArray2[j]);
                }
            }
        }
    }
}
