package com.problems.a007_armstrong_and_strong_nums;

public class ArmStrongNumber {
    //123 ----> 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36 ------> No
    //153 ----> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 ---> Yes
    public static boolean armstrong(int n) {
        int temp=n,s=0,d;
        int length = Integer.toString(n).length();
        while(n!=0) {
            d=n%10;
            s=s+powton(d,length);
            n=n/10;
        }
        return temp==s;
    }

    private static int powton(int d, int length) {
        int r=1;
        for(int i=1;i<=length;i++){
            r=r*d;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(powton(5,3)); //125
        System.out.println(armstrong(123));//false
        System.out.println(armstrong(153));//true
        System.out.println(armstrong(370));//true
        System.out.println(armstrong(407));//true
    }
}
