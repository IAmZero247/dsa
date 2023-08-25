package com.stack.problems;

import java.util.Stack;

public class PostfixEvaluation {
    //postfix expression are evaluated very fast compared with other expression

    /**
     *
     * steps
     *
     * 1. create a stack to store operands
     * 2. scan the expr from left to right and do the following
     *  a. if the element is a number then push into stack
     *  b. if the element is a operator , pop two operands from stack and
     *     eval again and push result into stack
     * 3. when the exp is ended , the number in the stack is nothing result;
     *
     */

    public static void main(String[] args) {

    }


    public static int evalPostFixExpression(String exp){
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<exp.length(); i++){
            char ch = exp.charAt(i);
        }

        return 0;
    }







}
