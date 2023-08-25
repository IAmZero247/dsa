package com.problems.a002max_and_min;

public class MaxNMin2Nums {

    //using if else
    //using conditional operators
    //using predefined methods

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("max: " + m1(a,b) +" min:" + m2(a,b));
        System.out.println("max: " + m3(a,b) +" min:" + m4(a,b));
        System.out.println("max: " + m5(a,b) +" min:" + m6(a,b));
    }

    private static Integer m1(int a, int b) {
        if(a>b) return a;
        else return b;
    }

    private static Integer m2(int a, int b) {
        if(a<b) return a;
        else return b;
    }

    private static Integer m3(int a, int b) {
       return a>b?a:b;
    }

    private static Integer m4(int a, int b) {
       return a<b?a:b;
    }

    private static Integer m5(int a, int b) {
        return Math.max(a,b);
    }

    private static Integer m6(int a, int b) {
        return Math.min(a,b);
    }


}
