package com.queue.b2circularQUsingSLL;

import com.queue.b1circularQUsingArray.CQueueArray;

public class CQueueSllTest {
    public static void main(String[] args) {
        CQueueSLL q = new CQueueSLL();
        q.display(); //Q is Empty
        q.insert(10);
        q.display(); //10
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.display();//10 20 30 40 50 60 70
        q.delete();
        q.delete();
        q.delete();
        q.display(); //40 50 60 70
        q.insert(80);
        q.display();  //40 50 60 70 80
        q.delete();
        q.delete();
        q.delete();
        q.display(); //70 80
        q.insert(90);
        q.insert(100);
        q.display(); //70 80 90 100
        System.out.println(q.getSize());
    }
}
