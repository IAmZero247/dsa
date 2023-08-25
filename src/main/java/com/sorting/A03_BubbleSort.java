package com.sorting;

import java.util.Arrays;

public class A03_BubbleSort {
    public static void main(String[] args) {
        int[] arr = UtilityArraySorting.generateArray(10);
        //int [] arr = new int[]{6 ,30 ,5, 66 , 77 , 88};
        bubbleSortAsc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
        bubbleSortDesc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static void bubbleSortAsc(int[] arr){
        int size = arr.length;
        boolean isswapped;
        //Because bubble sort select adjacent element iteration
        //should go only till second last element
        for (int i =0 ; i<size-1; i++){
            //System.out.println("OuterIteration:" +i);
            isswapped = false;
            /* 1. compare two adjacent elements means j and j+1
             * 2. move larger element to right of array by swapping inside the inner loop
             *
             * 3. change > to < to sort in descending order
             *
             */
            for(int j=0; j<size-i-1; j++){
                //System.out.println("Inner Iteration:" +j );
                if(arr[j]> arr[j+1]){
                    isswapped= true;
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(isswapped ==false){
                //this means all the remaining element in arry are sorted to the end
                break;
            }

        }
    }

    public static void bubbleSortDesc(int[] arr){
        int size = arr.length;
        boolean isswapped;
        for (int i =0 ; i<size-1; i++){
           // System.out.println("OuterIteration:" +i);
            isswapped = false;
            for(int j=0; j<size-i-1; j++){
                //System.out.println("Inner Iteration:" +j );
                if(arr[j]< arr[j+1]){
                    isswapped= true;
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(isswapped ==false){
                break;
            }

        }
    }


}
