package com.problems.a003iseven;

public class IsEven {

    //using modulous operator %2
    //using  bitwise operator &1


    public static void main(String[] args) {
       for(int i=1; i<20; i++){
           System.out.println("n->"+i+" , m1->" + m1(i) +" , m2->" +m2(i));
       }
    }

    private static String m1(int n) {
        if(n%2==0)
            return "even";
        return "odd";
    }

    private static String m2(int n) {
       if((n&1) ==0)
           return "even";
       return "odd";
    }






}