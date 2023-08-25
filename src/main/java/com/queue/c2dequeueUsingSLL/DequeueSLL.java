package com.queue.c2dequeueUsingSLL;

public class DequeueSLL {
    Node front, rear;
    int size;

    public DequeueSLL() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(front==null||rear==null) {
                return true;
        }else {
        return false;
        }
    }

    public int getSize(){
        return size;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("DQueue Is Empty");
            return;
        }
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
        return;
    }

    public void insertAtFront(int data){
        Node newData = new Node(data);
        System.out.println("Data Inserted At Front :"+ data);
        if(isEmpty()){
            front= rear= newData;
            size++;
            return;
        }
        /**
         *   n f r
         */
        newData.next= front;
        front= newData;
        size++;
        return;
    }
    public void insertAtRear(int data){
        Node newData = new Node(data);
        System.out.println("Data Inserted At Rear :"+ data);
        if(isEmpty()){
            front= rear= newData;
            size++;
            return;
        }
        /**
         *    f r n
         */
        rear.next= newData;
        rear=newData;
        size++;
        return;
    }

    public void deleteAtFront(){
        if(isEmpty()){
            System.out.println("DQueue Is Empty");
            return;
        }
        /**
         *    f nf r
         */
        if(front==rear){
            front=rear=null;
            size=0;
            return;
        }
        front =front.next;
        size--;
        return;
    }
    public void deleteAtRear(){
        if(isEmpty()){
            System.out.println("DQueue Is Empty");
            return;
        }
        /**
         *    f nr r
         */
        if(front==rear){
            front=rear=null;
            size=0;
            return;
        }
        Node temp = front;
        while(temp.next !=rear){
            temp= temp.next;
        }
        temp.next=null;
        rear=temp;
        size--;
        return;
    }



    static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
