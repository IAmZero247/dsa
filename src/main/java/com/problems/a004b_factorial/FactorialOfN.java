package com.problems.a004b_factorial;

public class FactorialOfN {
    //recursion
    //forloop



    public static void main(String[] args) {
        for(int i=0;i<=10 ; i++){
            System.out.println( "i:" +i+ "  ,fact1:"+ fact1(i)+"  ,fact2:" +fact2(i));
        }

    }

    private static int fact1(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    private static int fact2(int n) {
        if (n==1)
            return 1;
        return n * fact1(n-1);
    }
}
