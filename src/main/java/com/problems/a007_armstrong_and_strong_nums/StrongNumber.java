package com.problems.a007_armstrong_and_strong_nums;

public class StrongNumber {
    //123 ----> 1! + 2! + 3! = 1 + 2 + 6 = 9
    //  145 ----> 1! + 4! + 5! = 1 + 24 + 120 = 145
    public static boolean strong(int n) {
        int temp=n,s=0,d;
        int length = Integer.toString(n).length();
        while(n!=0) {
            d=n%10;
            s=s+fact(d);
            n=n/10;
        }
        return temp==s;
    }

    private static int fact(int d) {
        int r=1;
        for(int i=1;i<=d;i++){
            r=r*i;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(strong(123));//false
        System.out.println(strong(145));//true
    }
}
