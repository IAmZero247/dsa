package com.stack.usingArrays;

public class StackArrayTesting {
    public static void main(String[] args) {
        StackArray sa = new StackArray(5);
        System.out.println( "IsEmpty :" +sa.isEmpty() +", Size :" +sa.getSize());
        sa.push(111);
        sa.push(222);
        sa.push(333);
        System.out.println( "IsEmpty :" +sa.isEmpty() +", Size :" +sa.getSize());
        sa.push(444);
        sa.push(555);
        sa.push(666);
        System.out.println( "IsEmpty :" +sa.isEmpty() +", Size :" +sa.getSize());
        System.out.println( "Pop :" +sa.pop());
        System.out.println( "IsEmpty :" +sa.isEmpty() +", Size :" +sa.getSize());
        System.out.println( "Peek :" +sa.peek());
        System.out.println( "IsEmpty :" +sa.isEmpty() +", Size :" +sa.getSize());
        System.out.println( "Search :" +sa.search(123));
        System.out.println( "Search :" +sa.search(333));

    }
}
