package com.strings.basics;

public class a03StringConstructors {
    /**
     * 1. String() ---> It creates an empty string
     * 2. String(str_literal) ---> It create a string obj with given literal
     * 3. String(char[]) --------> It creates a string obj with char[]
     * 4. String(char[],int,int) -> It creates a string obj with start loc to num of cha
     * 5. String(byte[]) ---------> it creates a string obj with given byte[]
     * 6. String(StringBuffer) ---> it creates a string with StringBuffer obj
     * 7. String(StringBuilder) --> it creates a string with StringBuilder obj
     *
     */

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public static void m1(){
        String s = new String();
        System.out.println(s);//
        System.out.println(s.length());//0
    }
    public static void m2(){
        String s = new String("abcdefgh");

        System.out.println(s);//abcdefgh
        System.out.println(s.length());//8
    }

    public static void m3(){
        char[] ch = {'w','e','l','c','o','m','e'};

        String s = new String(ch);
        System.out.println(s);//welcome
    }

    public static void m4(){
        char[] ch = {'w','e','l','c','o','m','e', ' ', 'a', 'g', 'i', 'a', 'n' };
        //            0   1   2   3   4   5   6
        String s = new String(ch,3,4);
        System.out.println(s);//come
    }
    public static void m5(){
        byte[] b = {65, 66, 67, 68, 97, 98, 99};
        String s = new String(b);
        System.out.println(s);//ABCDabc
    }

    public static void m6(){
        StringBuffer sb = new StringBuffer("welcome");
        String s = new String(sb);
        System.out.println(sb);//welcome
        System.out.println(s);//welcome
    }
    public static void m7(){
        StringBuilder sb = new StringBuilder("java");
        String s = new String(sb);
        System.out.println(sb);//java
        System.out.println(s);//java
    }
}
