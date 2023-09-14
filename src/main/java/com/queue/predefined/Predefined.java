package com.queue.predefined;
import java.util.PriorityQueue;
import java.util.Queue;

public class Predefined {


    public static void main(String[] args) {
        priorityQueue();
    }


    static void priorityQueue(){
        Queue q = new PriorityQueue();
        /**
         * offer to add element
         */
        q.offer(111);
        q.offer(222);
        q.offer(333);
        System.out.println(q);
        /**
         * peek and poll
         * peek to see next element
         * poll to remove element
         */
        System.out.println(q.peek());

    }




}
