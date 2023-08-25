package com.queue.a2normalQUsingSLL;

public class NQueueSLL {
    Node front;
    Node rear; /**rear is always ahead/equal to front;*/

    int size;

    public NQueueSLL() {
        front=rear=null;
        size=0;
    }

    boolean isEmpty(){
        if(front==null || rear==null){
            return true;
        }return false;
    }

    int nodes(){
        int count=0;
        Node temp= front;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }


    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp= front;
        while(temp!=null){
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println();
        return;
    }

    /**
     * only rear participate in insert/enqueue
     * @param data
     */
    public void enqueue(int data){
        Node temp = new Node(data);
        if(front==null || rear==null){
            front=rear= temp;
            size++;
            return;
        }else{
            rear.next = temp;
            rear=temp;
            size++;
            return;
        }
    }

    /**
     * only front will participate in dequeue
     */
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node deletedElement = front;
        System.out.println("Deleted Element :"+ deletedElement.value);
        front = front.next;
        size--;
        deletedElement=null;
       return;
    }

    static class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
