package com.queue.c2dequeueUsingSLL;

import com.queue.c1dequeueUsingArray.DequeueArray;

public class DQueueSllTest {
    public static void main(String[] args) {
        DequeueSLL q = new DequeueSLL();
        q.display(); //Q is Empty
        q.insertAtFront(10);
        q.insertAtFront(20);
        q.insertAtFront(30);
        q.display(); //30 20 10
        q.insertAtRear(40);
        q.insertAtRear(50);
        q.insertAtRear(60);
        q.display();//30 20 10 40 50 60
        q.insertAtRear(70);
        System.out.println("SIZE :" + q.getSize());//7
        q.deleteAtFront(); //20 10 40 50 60 70
        q.deleteAtFront(); //10 40 50 60 70
        q.deleteAtRear();  //10 40 50 60
        q.display(); //10 40 50 60
        System.out.println("SIZE :" + q.getSize());//4
        q.insertAtRear(80);
        q.display();  //10 40 50 70 80
        q.insertAtFront(90);
        q.display();  //90 10 40 50 70 80
        System.out.println(q.getSize()); //6
    }
}
