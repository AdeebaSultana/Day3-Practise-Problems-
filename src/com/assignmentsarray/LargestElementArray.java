package com.assignmentsarray;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr={10,60,30,40,90,50,100,70,12};
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("The largest number in the given array is : ");
        System.out.println(max);
    }
}