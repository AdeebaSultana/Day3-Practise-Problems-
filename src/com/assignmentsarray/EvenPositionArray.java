package com.assignmentsarray;

public class EvenPositionArray {
    public static void main(String[] args) {
        int[] arr={10,60,30,40,90,3,50,100,70,12,5};
        System.out.println("The even position of array is : ");
        for (int i=0;i< arr.length;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}
