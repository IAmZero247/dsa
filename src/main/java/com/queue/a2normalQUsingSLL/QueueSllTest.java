package com.queue.a2normalQUsingSLL;


public class QueueSllTest {
    public static void main(String[] args) {
        NQueueSLL q = new NQueueSLL();
        q.display(); //Q is Empty
        q.enqueue(10);
        System.out.println("Qsize :" + q.size);//1
        q.display(); //10
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        System.out.println("Qsize :" + q.size);//7
        q.display();//10 20 30 40 50 60 70
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Qsize :" + q.size);//4
        q.display(); //40 50 60 70
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue(); //Q is Empty;
        System.out.println("Qsize :" + q.size);//0

    }
}
