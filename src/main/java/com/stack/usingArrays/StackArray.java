package com.stack.usingArrays;

import java.util.Arrays;

public class StackArray {

    int size;
    Integer[] data;
    int top;

    public StackArray(int size) {
        this.size = size;
        data = new Integer[size];
        top = -1;
    }



    public int getSize(){
        return top+1;
    }

    public boolean isEmpty(){
        return -1==top;
    }


    public void print(){
        if(isEmpty()){
             System.out.println("Stack is Underflow");
             return;
        }
        for(int i=0;i<=top; i++){ //<data.length
            System.out.print(data[i] + " ");
        }
        System.out.println();
        return;
    }

    public void push(int val){
        if(getSize()==data.length){
            System.out.println("Stack is Overflow");
            return;
        }
        top++;
        data[top]=val;
        return;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return data[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return data[top];
    }

    public boolean search(int val){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return false;
        }
        for(int i=0;i<=top; i++){ //<data.length
            if (data[i]==val){return true;}
        }
        return false;
    }


}
