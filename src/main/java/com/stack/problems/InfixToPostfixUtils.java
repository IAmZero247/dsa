package com.stack.problems;

import java.util.Stack;

public class InfixToPostfixUtils {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b")); //ab+
        System.out.println(infixToPostfix("a*b+c")); //ab*c+
        System.out.println(infixToPostfix("a+b*c")); //abc*+
        System.out.println(infixToPostfix("(a+b)*c")); //ab+c*
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i")); //abcd^e-fgh*+^*+i-
    }



    static int getPredence(char c){
        if( c=='^'){
            return 3;
        }else if(c=='/' || c=='*'){
            return 2;
        }else if (c=='+' || c=='-'){
            return 1;
        }else{
            return -1;
        }
    }
    public static String infixToPostfix(String infix){
        //operator preced ( / * + -
        String output="";
        char[] arr = infix.toCharArray();
        Stack<Character> stack= new Stack<Character>();
        for(Character c:arr){
            if(Character.isLetterOrDigit(c)){
                output +=c;
                continue;
            }else if(c=='('){
                stack.push(c);
                continue;
            }else if(c==')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    output+=stack.peek();
                    stack.pop();
                }
                stack.pop();
                continue;
            }else{
                if(!stack.isEmpty() && getPredence(c) > getPredence(stack.peek())){
                    stack.push(c);
                    continue;
                }
                if(!stack.isEmpty() && getPredence(c) <= getPredence(stack.peek())){
                   while(!stack.isEmpty() && getPredence(c) <= getPredence(stack.peek())){
                       output+=stack.peek();
                       stack.pop();
                    }
                   stack.push(c);
                   continue;
                }
                if(stack.isEmpty()){
                    stack.push(c);
                    continue;
                }
            }
        }//end for loop
        while(!stack.isEmpty()){
            //if (stack.peek() == '(')
              //  return "Invalid Expression";
            output+=stack.peek();
            stack.pop();
        }
        return output;
    }
}
