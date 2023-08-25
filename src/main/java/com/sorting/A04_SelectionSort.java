package com.sorting;

import java.util.Arrays;

public class A04_SelectionSort {
    public static void main(String[] args) {
        int[] arr = UtilityArraySorting.generateArray(10);
        //int [] arr = new int[]{6 ,30 ,5, 66 , 77 , 88};
        selectionSortAsc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
        selectionSortDesc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    private static void selectionSortAsc(int[] arr) {
        for(int i=0; i< arr.length-1 ;i++ ){
            int minIndex =i;
            /*
             * identify the element with minimum value for current iteration using inner loop
             */
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            //Swapping Executed after identifying min value Index
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] =arr[i];
                arr[i]=temp;
            }
        }
    }

    private static void selectionSortDesc(int[] arr) {
        for(int i=0; i< arr.length-1;i++ ){
            int minIndex =i;
            for(int j=i+1; j<arr.length ; j++){
                if (arr[j] > arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] =arr[i];
                arr[i]=temp;
            }
        }
    }
}
