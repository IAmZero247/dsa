package com.problems.a006c_paliandrome_numbers;

public class PaliandromeNumbers {
    public static void main(String[] args) {

        System.out.println(pal1(121));
        System.out.println(pal1(123));
        System.out.println(pal2(121));
        System.out.println(pal2(456));
    }

    private static boolean pal1(int i) {
        int num=i;
        int digit=0;
        int reverse=0;
        while(num!=0){
            digit=num%10;
            reverse=(reverse*10)+digit;
            num=num/10;
        }
        return i==reverse;
    }
    public static boolean pal2(int n) {
        String s = Integer.toString(n);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String ss = sb.toString();
        return Integer.parseInt(ss)==n;
    }
}
