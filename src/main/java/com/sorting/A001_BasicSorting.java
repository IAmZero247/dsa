package com.sorting;

import java.util.Arrays;

public class A001_BasicSorting {
    /*
    case 1: sorting data in ascending order
    case 2: sorting data in descending order
    case 3: sorting data within the given start and end index values asc
    case 4: sorting data within the given start and end index values desc
     */

    public static void main(String[] args) {
        int[] inputArr = UtilityArraySorting.generateArray(15);
        //m1SortAsc(inputArr);
        //m2SortDesc(inputArr);
        int start =5;
        int end=10;
        m3SortAsc(inputArr, start,end);
        m4SortDesc(inputArr, start,end);
        System.out.println("Sorted Arr:->" + Arrays.toString(inputArr));
    }

    public static void m1SortAsc(int [] arr){
        for(int i =0; i<arr.length; i++){
            int temp= arr[i];
            //this loop iterates from i+1
            for(int j=i+1;j<arr.length;j++){
                //swap if need
                if(arr[i]> arr[j]){
                    arr[i]=arr[j];
                    arr[j]=temp;
                    temp=arr[i];
                }
            }
        }
    }

    public static void m2SortDesc(int [] arr){
        for(int i =0; i<arr.length; i++){
            int temp= arr[i];
            //this loop iterates from i+1
            for(int j=i+1;j<arr.length;j++){
                //swap if need
                if(arr[i]< arr[j]){
                    arr[i]=arr[j];
                    arr[j]=temp;
                    temp=arr[i];
                }
            }
        }
    }

    public static void m3SortAsc(int[] arr, int start, int end){
        for(int i=start;i<=end;i++) {
            int temp= arr[i];
            for(int j=i+1;j<end;j++) {
                if(arr[i]>arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp=arr[i];
                }
            }
        }
    }

    public static void m4SortDesc(int[] arr, int start, int end){
        for(int i=start;i<=end;i++) {
            int temp= arr[i];
            for(int j=i+1;j<end;j++) {
                if(arr[i]<arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp=arr[i];
                }
            }
        }
    }
}
