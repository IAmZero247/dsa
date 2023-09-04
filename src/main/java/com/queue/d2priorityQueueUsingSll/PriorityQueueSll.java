package com.queue.d2priorityQueueUsingSll;

public class PriorityQueueSll {
    //front hold highest element;
    Node front, rear;
    int size;

    public PriorityQueueSll() {
        front =rear =null;
        size=0;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public int getSize(){
        if(isEmpty()){
            return 0;
        }
        int count= 0;
        Node temp= front;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("PQ is Empty");
            return;
        }
        Node temp= front;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
        return;
    }


    public void insert(int data){
        Node newNode = new Node(data);
        System.out.println("Inserting Element :" +data);
        if(isEmpty()){
            front=rear=newNode;
            size++;
            return;
        }
        if(data>=front.data){
            newNode.next=front;
            front= newNode;
            size++;
            return;
        }
        Node temp= front;
        while(temp.next !=null  && temp.next.data>=data){
            temp =temp.next;
        }
        if(temp.next==null){
            temp.next=newNode;
            rear= newNode;
        }else{
            newNode.next=temp.next;
            temp.next=newNode;
        }
        size++;
    }
    public void delete(){
        if(isEmpty()){
            System.out.println("PQ is Empty");
            return;
        }
        System.out.println("Deleting Element :" +front.data);
        if(front==rear){
            front=rear=null;
            size=0;
            return;
        }
        Node toBeDel= front;
        front = front.next;
        toBeDel=null;
        size--;
        return;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("PQ is Empty");
            return -1;
        }
        return front.data;
    }

    static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
