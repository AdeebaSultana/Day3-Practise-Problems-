package com.assignmentsarray;

public class SmallestElementArray {
    public static void main(String[] args) {
        int[] arr={10,60,30,40,90,3,50,100,70,12,5};
        int min=arr[0];
        for (int i=0;i< arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The smallest number in the given array is : ");
        System.out.println(min);
    }
}