package com.problems.a008_fib_and_trib_series;

import java.util.ArrayList;

public class TribSequence {
    public static ArrayList<Integer> trib(int n){
        ArrayList r = new ArrayList();
        int a=0;
        int b=1;
        int c=2;
        r.add(a);
        r.add(b);
        r.add(c);
        for(int i=3;i<n;i++){
            int n1= a+b+c;
            r.add(n1);
            a=b;
            b=c;
            c=n1;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(trib(7));//[0, 1, 2, 3, 6, 11, 20]
    }
}
