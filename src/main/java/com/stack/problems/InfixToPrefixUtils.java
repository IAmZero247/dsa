package com.stack.problems;

public class InfixToPrefixUtils {
    public static void main(String[] args) {
        System.out.println(infixToPrefix("a+b")); //+ab
        System.out.println(infixToPrefix("a*b+c")); //+*abc
        System.out.println(infixToPrefix("a+b*c")); //abc*+
        //System.out.println(infixToPrefix("(a+b)*c")); //ab+c*
        //System.out.println(infixToPrefix("a+b*(c^d-e)^(f+g*h)-i")); //abcd^e-fgh*+^*+i-
    }


    /**
     *
     * infix to prefix conversion
     *
     * steps:
     * 1. reverse the expression  ---> b+a
     * 2. postfix representation  --->ba+
     * 3. reverse above ------------->+ab
     */


    public static String infixToPrefix(String exp){
        String reverse = new StringBuffer(exp).reverse().toString();
        String postfix= InfixToPostfixUtils.infixToPostfix(reverse);
        return new StringBuffer(postfix).reverse().toString();
    }
}
