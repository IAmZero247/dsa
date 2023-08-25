package com.problems.a002max_and_min;

public class MaxNMin4Nums {
    //using if else
    //using conditional operators
    //using predefined methods

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;
        System.out.println("max: " + m1(a,b,c,d) +" min:" + m2(a,b,c,d));
        System.out.println("max: " + m3(a,b,c,d) +" min:" + m4(a,b,c,d));
        System.out.println("max: " + m5(a,b,c,d) +" min:" + m6(a,b,c,d));
    }

    private static Integer m1(int a, int b, int c, int d) {
        if(a>b && a>c && a>d) {
            return a;
        }else if(b>c && b>d){
            return b;
        } else if(c>d){
            return c;
        }else {
            return d;
        }
    }

    private static Integer m2(int a, int b,int c, int d) {
        if(a<b && a<c && a<d) {
            return a;
        }else if(b<c && b<d){
            return b;
        } else if(c<d){
            return c;
        }else {
            return d;
        }
    }

    private static Integer m3(int a, int b,int c, int d) {

        return (a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
    }

    private static Integer m4(int a, int b,int c, int d) {

        return (a<b && a<c && a<d)?a:(b<c && b<d)?b:(c<d)?c:d;
    }

    private static Integer m5(int a, int b, int c, int d) {
        return Math.max(Math.max(a,b),Math.max(c,d));
    }

    private static Integer m6(int a, int b, int c, int d) {
        return Math.min(Math.min(a,b),Math.min(c,d));
    }

}
