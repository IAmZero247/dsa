package com.problems.a006a_extract_digits;

public class ExtractDigits {

    public static void main(String[] args) {
       extract(123);
       extract(4567);
    }

    private static void extract(int num) {
        int digit=0;
        while(num!=0){
            digit=num%10;
            System.out.print(digit);
            System.out.print(" ");
            num=num/10;
        }
        System.out.println();
    }
}
