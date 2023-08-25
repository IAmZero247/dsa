package com.stack.usingLinklist;

import java.util.Arrays;

public class StackSll {
    Node top;
    int size;

    public StackSll() {
        top=null;
        size=0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return getSize()==0; //top==null
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Stack is underflow | empty");
            return;
        }
        Node temp= top;
        while(temp!=null){
            System.out.print(temp.data + " =>");
            temp=temp.next;

        }
        System.out.println();
        return;
    }

    public void push(int data){
     top =  new Node(data, top);
     size++;
     return;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow | empty");
            return -1;
        }
        Node temp = top;
        top =  top.next;
        size--;
        return temp.data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is underflow | empty");
            return -1;
        }
        return top.data;
    }

    public boolean search(int dataval){
        if(isEmpty()){
            System.out.println("Stack is underflow | empty");
            return false;
        }
        Node temp= top;
        while(temp!=null){
            if(temp.data==dataval){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node temp = top;
        sb.append("[");

        while(temp!=null) {
            sb.append(temp.data + " ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
