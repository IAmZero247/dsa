package com.sorting;

import java.util.Arrays;

public class A07_CountingSort {
    public static void main(String[] args) {


        int[] arr = UtilityArraySorting.generateArray(15, 20 ,30 );
        //int [] arr = new int[]{10 ,20 ,50, 80 , 23 , 21, 9, 55};


        System.out.println("Sorted Array   :->" + Arrays.toString(arr));

        //shellSortDesc(arr);
        System.out.println("Sorted Array   :->" + Arrays.toString(arr));
    }

    public static int[] countingSortAsc(int[] a,int lRange,int uRange)
    {
        int n = a.length;
        int range = uRange - lRange;
        int[] count = new int[range];
        int i,j=0;
        for(i=0;i<n;i++)
            count[a[i]-lRange]++;
return null;
    }
}
