package com.assignmentsarray;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={10,60,30,40,90,3,50,100,70,12,5};
        System.out.println("Reverse of the given array is : ");
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}