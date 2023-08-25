package com.stack.usingLinklist;

public class StackSllTesting {
    public static void main(String[] args) {
        StackSll sa = new StackSll();
        System.out.println("IsEmpty :" + sa.isEmpty() + ", Size :" + sa.getSize());
        sa.push(111);
        sa.push(222);
        sa.push(333);
        System.out.println("IsEmpty :" + sa.isEmpty() + ", Size :" + sa.getSize());
        sa.push(444);
        sa.push(555);
        sa.push(666);
        sa.print();
        System.out.println("IsEmpty :" + sa.isEmpty() + ", Size :" + sa.getSize());
        System.out.println("Pop :" + sa.pop());
        System.out.println("IsEmpty :" + sa.isEmpty() + ", Size :" + sa.getSize());
        System.out.println("Peek :" + sa.peek());
        System.out.println("IsEmpty :" + sa.isEmpty() + ", Size :" + sa.getSize());
        sa.print();
        System.out.println("Search :" + sa.search(123));
        System.out.println("Search :" + sa.search(333));
        System.out.println(sa);
    }
}
