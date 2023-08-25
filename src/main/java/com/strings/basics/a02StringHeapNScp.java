package com.strings.basics;

public class a02StringHeapNScp {
    public static void main(String[] args) {

    }

    public static void case1(){
        String s = new String("prakash");
        /**
        heap ---> 1
        scp ----> 1
        total --> 2

                => When ever we are creating a string obj using double quotes "SCP"
                => when ever we are creating a string obj using new keyword "HEAP"
         **/
    }

    public static void case2(){
        String s = "prakash";
        /**
        heap ---> 0
        scp ----> 1
        total --> 1
         **/
    }

    public static void case3(){
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        /**
        heap ----> 2
        scp -----> 1
        total ---> 3**/

        //=> obj creation in SCP is always optional, first JVM will check is there any obj already created in SCP with same content, then new obj wn't be created in SCP.
        //=> there is no chance of existing two objects with same content on SCP
        //=> duplicate objects are not allowed in SCP
    }

    public static void case4(){
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1==s2);//false
        System.out.println(s3==s4);//true
    }

    public static void case5(){
        String s = new String("abc"); //heap 1 | scp 1
        s.concat("def"); // heap 1<anonymous> | scp 1
        s=s.concat("xyz"); // heap 1 | scp 1
        System.out.println(s);//abcxyz

        /**
         * heap -----> 3 abc ,def ,xyz
         * scp ------> 3 abc ,abcdef , abcxyz
         * total ----> 6
         */
    }

    public static void case6(){
        String s1 = new String("spring");
        s1.concat("fall");
        String s2 = s1.concat("winter");
        s2.concat("summer");
        System.out.println(s1);//spring
        System.out.println(s2);//springwinter

        /**
        heap -----> 4 spring, springfall(a), springwinter, springwintersummer(a)
        scp ------> 4 spring, fall ,winter, summer
        total ----> 8
         **/
    }

    public static void case7(){
        String s1 = new String("i love my india"); //heap 1 | scp 1 "i love my india"
        String s2 = new String("i love my india"); //heap 1 | scp 0
        System.out.println(s1==s2);//false
        String s3 = "i love my india";  //scp 0 "i love my india"
        System.out.println(s1==s3);//false
        String s4 = "i love my india"; //scp 0 "i love my india"
        System.out.println(s3==s4);//true
        String s5 = "i love" + " my india";  //compiler will create in scp , scp already has this (scp 0 "i love my india")
        System.out.println(s4==s5);//true
        String s6 = "i love";  // scp 1 "i love"
        String s7 = s6 + " my india"; // heap 1 | scp 1 "my india"
        System.out.println(s4==s7);//false
        final String s8 = "i love";// scp 0 "i love"
        String s9 = s8 + " my india"; //compiler will replace final and creat in scp (scp 0 "i love my india")
        System.out.println(s4==s9);//true
        System.out.println(s9==s7);//false

        /**
         * heap ---> 3
         * scp ----> 3 "i love my india" , "i love", "my india"
         */
    }
}
