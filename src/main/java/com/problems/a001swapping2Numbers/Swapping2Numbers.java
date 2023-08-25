package com.problems.a001swapping2Numbers;

public class Swapping2Numbers {
/**

    Algorithm:
    ----------
            1. read a and b values from the user.
            2. print a and b values on the console before swaping.
            3. apply business logic

    logic1: by using temp variable
    ------------------------------
    temp = a;
    a = b;
    b = temp;

    logic2: by using add and sub
    ----------------------------
    a = a+b;
    b = a-b;
    a = a-b;

    logic3: by using mul and div
----------------------------
    a = a*b;
    b = a/b;
    a = a/b;

    logic4: by using bitwise operators
----------------------------------
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;


    logic5: by using single line statement
--------------------------------------
    a = a+b - (b=a);
 **/


        public static void swap1(int x,int y) {
            System.out.println("before swaping a: "+x+" and b: "+y);
            //logic
            int temp = x;
            x = y;
            y = temp;
            System.out.println("after  swaping a: "+x+" and b: "+y);
        }
        public static void swap2(int x,int y) {
            System.out.println("before swaping a: "+x+" and b: "+y);
            //logic
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("after  swaping a: "+x+" and b: "+y);
        }
        public static void swap3(int x,int y) {
            System.out.println("before swaping a: "+x+" and b: "+y);
            //logic
            x = x * y;
            y = x / y;
            x = x / y;
            System.out.println("after  swaping a: "+x+" and b: "+y);
        }
        public static void swap4(int x,int y) {
            System.out.println("before swaping a: "+x+" and b: "+y);
            //logic
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
            System.out.println("after  swaping a: "+x+" and b: "+y);
        }
        public static void swap5(int x,int y)
        {
            System.out.println("before swaping a: "+x+" and b: "+y);
            //logic
            x = x+y-(y=x);
            System.out.println("after  swaping a: "+x+" and b: "+y);
        }
        public static void main(String[] args) {
            int a = 100;
            int b = 200;
            //make a call to swap method
            swap5(a,b);

        }
}
