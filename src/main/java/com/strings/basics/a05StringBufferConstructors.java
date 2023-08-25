package com.strings.basics;

public class a05StringBufferConstructors {
    public static void main(String[] args) {
    //m1();
    }

    /**
     * 1. StringBuffer(): It creates an empty SB object
     * 2. StringBuffer(int): it creates SB obj with given capacity
     * StringBuffer(String): it creates SB obj with given string
     */

    public static void m1() {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        System.out.println(sb.length());//0
        System.out.println(sb.capacity());
         /*
          create a sb with default capacity 16
         */
    }

    public static void m2() {
        StringBuffer sb = new StringBuffer(20);
        System.out.println(sb);
        System.out.println(sb.length());//0
        System.out.println(sb.capacity());//20
         /*
          create a sb with default capacity 20
         */
    }

    public static void m3() {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1);//
        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//0+def=0+16=16



        StringBuffer sb2 = new StringBuffer("abcd");
        System.out.println(sb2);//abcd
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//4+def=4+16=20 //capcaity = length + default capacity
    }


    public static void m4GuessCapacity(){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);//
        System.out.println(sb.length());//0
        System.out.println(sb.capacity());//16
        sb.append("abcdefghijklmnop");
        System.out.println(sb);//abcdefghijklmnop
        System.out.println(sb.length());//16
        System.out.println(sb.capacity());//16
        sb.append("q");
        System.out.println(sb);//abcdefghijklmnopq
        System.out.println(sb.length());//17
        //new cap = (old cap+1)*2
        System.out.println(sb.capacity());//34
    }
}
