package com.problems.a002max_and_min;

public class MaxNMin3Nums {
    //using if else
    //using conditional operators
    //using predefined methods

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        System.out.println("max: " + m1(a,b,c) +" min:" + m2(a,b,c));
        System.out.println("max: " + m3(a,b,c) +" min:" + m4(a,b,c));
        System.out.println("max: " + m5(a,b,c) +" min:" + m6(a,b,c));
    }

    private static Integer m1(int a, int b, int c) {
        if(a>b && a>c) {
            return a;
        }else if(b>c){
            return b;
        } else {
            return c;
        }
    }

    private static Integer m2(int a, int b,int c) {
        if(a<b && a<c) {
            return a;
        }else if(b<c){
            return b;
        } else {
            return c;
        }
    }

    private static Integer m3(int a, int b,int c) {
        return (a>b && a>c)?a:(b>c)?b:c;
    }

    private static Integer m4(int a, int b, int c ) {
        return  (a<b && a<c)?a:(b<c)?b:c;
    }

    private static Integer m5(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }

    private static Integer m6(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }

}
