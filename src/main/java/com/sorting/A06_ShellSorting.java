package com.sorting;

import java.util.Arrays;

public class A06_ShellSorting {
    public static void main(String[] args) {
        int[] arr = UtilityArraySorting.generateArray(14);
        //int [] arr = new int[]{10 ,20 ,50, 80 , 23 , 21, 9, 55};

        shellSortAsc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));

        //shellSortDesc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    private static void shellSortAsc(int[] arr) {

        for( int interval=arr.length/2; interval>0; interval/=2){
            //for(int i=1; i< arr.length; i++) insertion sort
            for(int i=interval ; i<arr.length ; i++){
                int j=i;
                /**
                 * for ascending arr[j]<arr[j-i]
                 * for decending >
                 */
                //while(j>)
                while( j-interval>=0 && arr[j]<arr[j-interval]){
                    int temp= arr[j];
                    arr[j] = arr[j-interval];
                    arr[j-interval]= temp;
                    j= j-interval;
                }
            }

        }

    }
}
