package com.queue.b2circularQUsingSLL;

public class CQueueSLL {
    Node front, rear;
    int size;


    public CQueueSLL() {
         front= rear= null;
         size=0;
    }

    boolean isEmpty(){
        return front==null;
    }

    int getSize(){
        return size;
    }




    public void display(){
        Node temp = front;
        if(temp==null){
            System.out.println("Queue is Empty");
            return;
        }
        if(temp.next==front){ //single element
            System.out.print(temp.data +" ");
            System.out.println();
            return;
        }else{
            while(temp.next!=front){
                System.out.print(temp.data +" ");
                temp= temp.next;
            }
            System.out.println(temp.data);
            return;
        }

    }


    public void insert(int data){
        Node newNode = new Node(data);
        System.out.println("Inserted Element : " +data);
        if(isEmpty()){ // isEmpty
            front=rear=newNode;
            rear.next=front;
            size++;
            return;
        }else{
            rear.next= newNode;
            rear=newNode;
            rear.next=front;
            size++;
            return;
        }

    }
    public void delete(){
        if(front==null){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted Element : " +front.data);
        if(front==rear){
            front=rear=null;
            size--;
            return;
        }
        Node toBeDel =front;
        front = front.next;
        rear.next = front;
        toBeDel=null;
        size--;
        return;
    }

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
