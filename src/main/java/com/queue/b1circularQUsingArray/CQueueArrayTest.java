package com.queue.b1circularQUsingArray;

public class CQueueArrayTest {
    public static void main(String[] args) {
        CQueueArray q = new CQueueArray(6);
        q.display(); //Q is Empty
        q.insert(10);
        q.display(); //10
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.insert(70); //Q is Full
        q.display();//10 20 30 40 50 60
        q.delete();
        q.delete();
        q.delete();
        q.display(); //40 50 60
        q.insert(70);
        q.display();  //40 50 60 70
        q.delete();
        q.delete();
        q.delete();
        q.display(); //70
        q.insert(80);
        q.insert(90);
        q.display(); //70 80 90
        System.out.println(q.getSize());
    }
}
