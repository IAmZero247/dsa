package com.strings.basics;

import java.util.StringTokenizer;

public class a07StringTokenizer {
    /**
     * => It is an utility class provided by java.util package.
     * => It is used to divide the string based on delimiter.
     *
     * Ex:
     * 	 "java is very easy" -----> ["java", "is", "very", "easy"]
     * 	 "19-07-2023" ------------> ["19","07","2023"]
     * 	 "07:50:34" --------------> ["07","50","34"]
     *
     * StringTokenizer st = new StringTokenizer(String,delimiter);
     *
     * int countTokens(); ---> returns num of tokens
     * boolean hasMoreTokens(); --> returns true if there is token
     * String nextToekn(); -------> returns current token and transfer to next
     * @param args
     */

    public static void main(String[] args) {
        sample2();
    }
    public static void sample1() {
        String s = new String("java is very easy");
        StringTokenizer st = new StringTokenizer(s," ");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        //4
        //java
        //is
        //very
        //easy
    }
    public static void sample2() {
        String s = new String("07:50:34");
        StringTokenizer st = new StringTokenizer(s,":");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        //4
        //07
        //50
        //34
    }


}
