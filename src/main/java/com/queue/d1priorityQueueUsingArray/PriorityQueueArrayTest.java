package com.queue.d1priorityQueueUsingArray;

public class PriorityQueueArrayTest {
    public static void main(String[] args) {
        PriorityQueueArray q = new PriorityQueueArray(6);
        q.display(); //Q is Empty
        q.insert(10);
        q.display();
        q.insert(20);
        q.display();
        q.insert(30);
        q.display(); //30 20 10
        System.out.println("Size : "+ q.size()); //3
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.insert(55); //PQ is Full
        q.display();
        System.out.println("Size : "+ q.size());//6
        q.delete();
        q.delete();
        q.display();
        System.out.println("Size : "+ q.size());//4
        q.insert(25);
        q.display();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.insert(100);
        q.display();
    }
}
