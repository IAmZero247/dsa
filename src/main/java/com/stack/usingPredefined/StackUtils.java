package com.stack.usingPredefined;

import java.util.Stack;

public class StackUtils {


    static void reverse(Stack<Integer> ss){
        if (ss.isEmpty()){
            return;
        }else{
            int temp =ss.pop();
            reverse(ss);
            insertAtBottom(ss, temp);
            return;
        }
    }


    static void insertAtBottom(Stack<Integer> ss, Integer val){
        if(!ss.isEmpty()){
            Integer temp = ss.pop();
            insertAtBottom(ss, val);
            ss.push(temp);
            return;
        }else{
            ss.push(val);
            return;
        }
    }

    static void sortingStackAsc(Stack<Integer> ss){
        if(!ss.isEmpty()){
            Integer temp = ss.pop();
            sortingStackAsc(ss);
            sortedInsertAsc(ss, temp);
        }
    }


    static void sortingStackDesc(Stack<Integer> ss){
        if(!ss.isEmpty()){
            Integer temp = ss.pop();
            sortingStackDesc(ss);
            sortedInsertDesc(ss, temp);
        }
    }

    static void sortedInsertAsc(Stack<Integer> ss, int value){
        if(ss.isEmpty() || ss.peek()<value){
            ss.push(value);
            return;
        }else{
            Integer temp = ss.pop();
            sortedInsertAsc(ss, value);
            ss.push(temp);
            return;
        }
    }
    static void sortedInsertDesc(Stack<Integer> ss, int value){
        if(ss.isEmpty() || ss.peek()>value){
            ss.push(value);
            return;
        }else{
            Integer temp = ss.pop();
            sortedInsertDesc(ss, value);
            ss.push(temp);
            return;
        }
    }
}
