package com.assignmentsarray;

public class DuplicatesOfArray {
    public static void main(String[] args) {
        int [] arr ={1, 2, 8, 3, 2, 5, 1,3};
        System.out.println("Duplicate elements in a given array is : ");
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}