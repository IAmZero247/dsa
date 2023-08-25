package com.sorting;

import java.util.Arrays;

public class A05_InsertionSort {
    public static void main(String[] args) {
        int[] arr = UtilityArraySorting.generateArray(10);
        //int [] arr = new int[]{6 ,30 ,5, 66 , 77 , 88};
        insertionSortAsc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
        insertionSortDesc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    private static void insertionSortAsc(int[] arr) {
        /*
         * 1. outer loop start from  index 1 to  index n
         * 2. in each iteration it choose index i and i-1 inside inner loop
         *    and do comparsion
         * 3. sorted subarray size increases by 1 every oter iteration
         * 4. j and j-1 comparsion happens inside sorted sub array
         *    if value at j is lower then value at  j-1 swap and continue while
         *    loop till element finds right position insidesorted subarry
         */
        for(int i=1 ; i<arr.length ; i++){
            int j=i;
            /**
             * for ascending arr[j]<arr[j-1]
             * for decending >
             */
            while( j>0 && arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
                j= j-1;
            }
        }
    }


    private static void insertionSortDesc(int[] arr) {
        for(int i=1 ; i<arr.length ; i++){
            int j=i;
            while( j>0 && arr[j]>arr[j-1]){
                int temp= arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
                j= j-1;
            }
        }
    }
}
