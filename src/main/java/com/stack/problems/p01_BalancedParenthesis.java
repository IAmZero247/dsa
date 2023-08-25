package com.stack.problems;


import java.util.Stack;

/**
 * () 				Yes
 * []				Yes
 * {}				Yes
 * (())				Yes
 * ([})				No
 * (({[]}))		    Yes
 * (({[}]))		    No
 */
public class p01_BalancedParenthesis {
    public static void main(String[] args) {
        System.out.println(isBalanced("()"));//true
        System.out.println(isBalanced("[]"));//true
        System.out.println(isBalanced("{}"));//true
        System.out.println(isBalanced("(())"));//true
        System.out.println(isBalanced("([])"));//true
        System.out.println(isBalanced("([{}])"));//true
        System.out.println(isBalanced("(([{}])"));//false
        System.out.println(isBalanced("([})"));//false
        System.out.println(isBalanced("([{]})"));//false

    }

    public static boolean isBalanced(String s){
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c : arr){
            switch (c){
                case '(': st.push(c);
                          break;
                case '[': st.push(c);
                          break;
                case '{': st.push(c);
                          break;
                case ')': {
                    if (st.pop()!='(') return false;
                    break;
                }
                case ']':{
                    if (st.pop()!='[') return false;
                    break;
                }
                case '}':{
                    if (st.pop()!='{') return false;
                    break;
                }
                default:
            }
        }
        return (st.isEmpty()) ? true:false;
    }
}
