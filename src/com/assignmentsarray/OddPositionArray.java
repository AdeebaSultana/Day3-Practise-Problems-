package com.assignmentsarray;

public class OddPositionArray {
    public static void main(String[] args) {
        int[] arr={10,60,30,40,90,3,50,100,70,12,5};
        System.out.println("The odd position of given array is : ");
        for (int i=1;i< arr.length;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}
