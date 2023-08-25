package com.problems.a008_fib_and_trib_series;

import java.util.ArrayList;
import java.util.List;

public class FibSequence {
    public static ArrayList<Integer> fib(int n){
        ArrayList r = new ArrayList();
        int a=0;
        int b=1;
        r.add(a);
        r.add(b);
        for(int i=2;i<n;i++){
            int n1= a+b;
            r.add(n1);
            a=b;
            b=n1;
        }
     return r;
    }
    public static void main(String[] args) {
        System.out.println(fib(7));//[0, 1, 1, 2, 3, 5, 8]
    }
}
