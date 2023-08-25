package com.queue.a1normalQUsingArray;

public class QueueArrayTest {
    public static void main(String[] args) {
        NQueueArray q = new NQueueArray(6);
        q.display(); //Q is empty
        q.enqueue(10);
        q.dequeue();
        q.display(); //Q is Empty
        q.enqueue(10);
        q.display(); //10
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70); //Q is Full
        q.display();//10 20 30 40 50 60
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display(); //40 50 60
        q.enqueue(70);//Q is full
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display(); //Q is Empty
        q.enqueue(70);
        q.enqueue(80);
        q.display();
        q.peek();

    }
}
