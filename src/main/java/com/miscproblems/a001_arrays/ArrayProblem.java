package com.miscproblems.a001_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayProblem {

    public static void main(String[] args) {
        int[] a1= new int[]{5,11,3,6,9};
        int[] a2=new int[]{7,1,6,4,13,19};
        //Expected r = 3,4,5,6,9,13
        a1= Arrays.stream(a1).sorted().toArray();
        a2=Arrays.stream(a2).sorted().toArray();
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        int p1=0;
        int p2=0;
        ArrayList<Integer> r = new ArrayList();
        boolean breakout = false;
        while(breakout==false){
            int temp=a1[p1];
            r.add(a1[p1]);
            while(a2[p2]<=temp){
                p2 = p2+1;
                if(p2 >= a2.length){
                    breakout=true;break;
                }
            }
            temp=a2[p2];
            r.add(a2[p2]);
            while(a1[p1]<=temp){
                p1=p1+1;
                if(p1>= a1.length){
                    breakout= true;break;
                }
            }
        }
        System.out.println(r);
    }
}
