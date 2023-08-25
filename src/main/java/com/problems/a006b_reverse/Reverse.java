package com.problems.a006b_reverse;

public class Reverse {



    public static void main(String[] args) {

        System.out.println(reverse1(123));
        System.out.println(reverse2(4567));
    }

    private static int reverse1(int num) {
        int digit=0;
        int reverse=0;
        while(num!=0){
            digit=num%10;
            reverse=(reverse*10)+digit;
            num=num/10;
        }
      return reverse;
    }
    public static int reverse2(int n) {
        String s = Integer.toString(n);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String ss = sb.toString();
        return Integer.parseInt(ss);
    }

}
