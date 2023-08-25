package com.strings.basics;

public class a06StringBufferMethods {
    public static void main(String[] args) {

    }

    /**
     *
     * 1.
     * int length()
     * returns num of characters present in a SB
     */
    public static void lengthSample() {
        StringBuffer sb = new StringBuffer("abcd");
        System.out.println(sb);//abcd
        System.out.println(sb.length());//4
    }

    /**
     *
     * 2.
     * int capacity()
     * returns the max number of characters it can hold, def capacity is 16
     */

    public static void capacitySample() {
        StringBuffer sb = new StringBuffer("abcd");
        System.out.println(sb);//abcd
        System.out.println(sb.length());//4
        System.out.println(sb.capacity());//4+16=20
    }

    /**
     *  3. setLength
     *  void setLength(int)
     *  It is used to set length of SB obj
     */


    public static void setLengthSample() {
        StringBuffer sb = new StringBuffer("welcome");
        System.out.println(sb);//welcome
        System.out.println(sb.length());//7
        System.out.println(sb.capacity());//7+16=23
        sb.setLength(2);
        System.out.println(sb);//we
        System.out.println(sb.length());//2
        System.out.println(sb.capacity());//23
    }

   /**
    * 4.
    * void ensureCapacity(int)
    * It increases capacity of SB obj with given integer value
    *
    */



    public static void ensureCapacity(String[] args) {
            StringBuffer sb = new StringBuffer();
            System.out.println(sb.capacity());//16
            sb.ensureCapacity(50);
            System.out.println(sb.capacity());//50
    }


    /**
     * 5.
     * char charAt(int) -> it returns char present at the given location
     * void setCharAt(int,char) -> It is used to insert new char at the given index value
     * void deleteCharAt(int) -> It is used to delete a char from the given location
     */


    public static void charSample1(String[] args) {
        StringBuffer sb1 = new StringBuffer("abcde");
        System.out.println(sb1.charAt(0));//a
        System.out.println(sb1.charAt(2));//c

        StringBuffer sb2 = new StringBuffer("abcde");
        System.out.println(sb2);//abcde
        sb2.setCharAt(2,'M');
        System.out.println(sb2);//abMde

        StringBuffer sb3 = new StringBuffer("pqrst");
        System.out.println(sb3);//pqrst
        sb3.deleteCharAt(3);
        System.out.println(sb3);//pqrt
    }


    /**
     * 6.
     *  void append(Obj) -> it is used to add an obj at the end of SB
     *  void insert(int,obj) ->it is used to add an obj at the given position
     *  void delete(int,int) -> it deletes chars from given start location to end location -1
     */

    public static void appendInsertDeleteSample(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hi Java And");
        System.out.println(sb1);//Hi Java And
        sb1.append(" Python");
        System.out.println(sb1);//Hi Java And Python

        StringBuffer sb2 = new StringBuffer("Hi Java Hello");
                                           //0       8
        System.out.println(sb2);//Hi Java Hello
        sb2.insert(8,", Python ");
        System.out.println(sb2);//Hi Java , Python Hello


        StringBuffer sb3 = new StringBuffer("abcdefghijkl");
        System.out.println(sb3);//abcdefghijkl
                                //   3  6
        sb3.delete(3,6);        //def will get deleted
        System.out.println(sb3);//abcghijkl
    }



   /**
    *7.
    * reverse() -> It is used to reverse the given string
    *
    */



   public static void reverseSample() {
       StringBuffer sb = new StringBuffer("abcdefghijkl");
       System.out.println(sb);//abcdefghijkl
       sb.reverse();
       System.out.println(sb);//lkjihgfedcba
   }
}
