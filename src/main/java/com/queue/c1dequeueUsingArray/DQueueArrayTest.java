package com.queue.c1dequeueUsingArray;


public class DQueueArrayTest {
    public static void main(String[] args) {
        DequeueArray q = new DequeueArray(6);
        q.display(); //Q is Empty
        q.insertAtFront(10);
        q.insertAtFront(20);
        q.insertAtFront(30);
        q.display(); //30 20 10
        q.insertAtRear(40);
        q.insertAtRear(50);
        q.insertAtRear(60);
        q.display();//30 20 10 40 50 60
        q.insertAtRear(70); //Q is Full
        System.out.println("SIZE :" + q.getSize());//6
        q.deleteAtFront(); //20 10 40 50 60
        q.deleteAtFront(); //10 40 50 60
        q.deleteAtRear();  //10 40 50
        q.display(); //10 40 50
        System.out.println("SIZE :" + q.getSize());//3
        q.insertAtRear(70);
        q.display();  //10 40 50 70
        q.insertAtFront(80);
        q.display();  //80 10 40 50 70
        System.out.println(q.getSize()); //5
    }
}
