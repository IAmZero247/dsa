package com.strings.basics;

public class a01MutableAndImmutable {
    public static void main(String[] args) {
        //Immutable
        String s = new String("abc"); //heap 1 | scp 1
        System.out.println(s);
        s.concat("def");//concat is used to add new string into existing str
        //now scp has 2 (abc, def)
        System.out.println(s);


        //Mutable
        StringBuffer sb1 = new StringBuffer("abc");
        System.out.println(sb1);//abc
        sb1.append("def");//concatenation
        System.out.println(sb1);//abcdef


        StringBuilder sb2 = new StringBuilder("ijk");
        System.out.println(sb2);//ijk
        sb2.append("mno");//concatenation
        System.out.println(sb2);//ijkmno
    }
}
