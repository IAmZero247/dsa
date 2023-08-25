package com.strings.basics;

import java.util.Arrays;

public class a04StringMethods {
    public static void main(String[] args) {

    }
    /*
     1.length and isEmpty
     int length() ----> num of char present in the given string
     boolean isEmpty() ---> return true if the content is empty else false
     */
    public static void lengthNIsEmpty(){
        String s1 = new String();
        String s2 = new String("abc");

        System.out.println(s1);//
        System.out.println(s1.length());//0
        System.out.println(s1.isEmpty());//true

        System.out.println(s2);//abc
        System.out.println(s2.length());//3
        System.out.println(s2.isEmpty());//false
    }
    /*
     2. charAt and startWith and EndWith
      char charAt(int) ----> it return char present at location, else SIOBE
      boolean startsWith(sub-str) --> returns true if main str starts with sub-str
      boolean endsWith(sub-str) ----> returns false if main str ends with sub-str
     */

    public static void charAtStartWithAndEndWith(){
        System.out.println("abc".charAt(0));//a
        System.out.println("abc".charAt(1));//b
        System.out.println("abc".charAt(2));//c
        System.out.println("abc".charAt(3));//Exception -> SIOBE

        System.out.println("java is very easy".startsWith("python"));//false
        System.out.println("java is very easy".startsWith("java"));//true
        System.out.println("java is very easy".endsWith("easy"));//true
        System.out.println("java is very easy".endsWith("difficult"));//false
    }
    /*
     * 3. getChars and toByteArray
     * byte[] getBytes() ---> it converts string into byte[]
     * char[] toCharArray()-> it converts string into char[]
     */

    public static void convertToCharNBytes(){
        String s = new String("abcABC");
        byte[] byteArr = s.getBytes();
        char[] charArr = s.toCharArray();
        System.out.println(s);//abcABC
        System.out.println(Arrays.toString(byteArr));//[97,98,99,65,66,67] ascii value
        System.out.println(Arrays.toString(charArr));//['a','b','c','A','B','C']
    }

    /* 4. equals
       equals(str) ---> returns true if main and str are having same content
       equalsIgnoreCase(str) --> ignoring case
     */

    public static void equalsNIgnoreCaseEquals(){
        System.out.println("abc".equals("abc"));//true
        System.out.println("abc".equals("ABC"));//false
        System.out.println("abc".equals("xyz"));//false

        System.out.println("abc".equalsIgnoreCase("abc"));//true
        System.out.println("abc".equalsIgnoreCase("ABC"));//true
        System.out.println("abc".equalsIgnoreCase("xyz"));//false
    }

    /**
     * 5. indexSamples
     * int indexOf(char) ---> returns first occurrence of given char
     * int lastIndexOf(char) --> returns last occurrence of given char
     */

    public static void indexOfSamples(){
        System.out.println("welcome".indexOf('e'));//1
        System.out.println("welcome".lastIndexOf('e'));//6
        System.out.println("welcome".lastIndexOf('x'));//-1
    }


    /**
     * 6. substrings
     * String substring(int) ---> extracts another string from given loc
     * String substring(int,int) --> extracts sub string from start to end-1
     */

    public static void subStringSamples(){
        String s = "java is very easy";
        //          0    5  8    13
        System.out.println(s);//java is very easy
        System.out.println(s.substring(8));//very easy
        System.out.println(s.substring(8,12));//very
    }

    /*7. concat
      String concat(str) ---> it perfomr concatenation operation
     */

    public static void concatSamples(){
        String a = "abc";
        String b = "def";
        System.out.println(a);//abc
        System.out.println(b);//def
        System.out.println(a.concat(b));//abcdef
        System.out.println(a+b);//abcdef
    }

    /**
     * 8. replace
     * String replace(old,new) ---> it replaces old occ with new occ
     */

     public static void replaceSample(){
         String s = "abcaba";
         System.out.println(s);//abcaba
         System.out.println(s.replace('a','x'));//xbcxbx
         System.out.println(s.replace("ab","x"));//xcxa
         System.out.println(s.replace('d','y'));//abcaba
     }

    /**
     * 9. case conversion
     * String toUpperCase() ---> converts given str into upper case
     * String toLowerCase() ---> converts given str into lower case
     */

    public static void caseConversion() {
        System.out.println("abcd".toUpperCase());//ABCD
        System.out.println("ABCD".toLowerCase());//abcd
    }

    /**
     * 10 split to tokens
     * String[] split(delimiter) --> it splits the given str into tokens
     */

    public static void splitSample() {
        String s = "java is very easy";
        String[] a = s.split(" ");
        System.out.println(s);//java is very easy
        System.out.println(Arrays.toString(a));//["java","is","very","easy"]
    }
}
