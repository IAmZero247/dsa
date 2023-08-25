package com.linkedlist.csll_implementation;

public class CSLL {
    public Node tail;
    public int size;

    public CSLL() {
        this.tail = null;
        this.size=0;
    }

    public Node getHead(){
        if (tail==null){
            return null;
        }else{
            return tail.next;
        }
    }

    public boolean isEmpty(){
       return tail==null;
    }

    public int size(){
        return size;
    }

    /**************************************************************
     *display
     **************************************************************/

    public void display(){
        if (tail==null){
            System.out.println("Empty Linked List");
            return;
        }
        Node temp = tail.next; //now temp is pointing to head
        while(temp != tail){
            System.out.print(temp.data +"<=>");
            temp= temp.next;
        }
        System.out.println(temp.data);
        return;
    }

    /**************************************************************
     *insertAtFirst
     *insertAtLast
     *insertAtPosition(index, data)
     **************************************************************/
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if (tail==null){
            tail= newNode;
            newNode.next=newNode;
            size++;
            return;
        }
        //1. fix head to newNode next
        Node head = tail.next;
        newNode.next= head;
        //2. reassign current tail next to newNode
        tail.next=newNode;
        // keep current tail as it is.
        size++;
        return;
    }
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if (tail==null){
            tail= newNode;
            newNode.next = newNode;
            size++;
            return;
        }
        //1. fix head to newNode next
        Node head = tail.next;
        newNode.next= head;
        //2. reassign current tail next to newNode
        tail.next=newNode;
        //3. set newNode as tail
        tail= newNode;
        size++;
        return;
    }

    public void insertAtPosition(int index, int data){
        if(index <0 || index > size+1){
            System.out.println("Invalid Index");
            return;
        }
        //case 1 : tail is null
        Node newNode = new Node(data);
        if (tail==null){
            tail= newNode;
            newNode.next=newNode;
            size++;
            return;
        }
        //case 2 : index is 0
        if(index==0){
            Node currentHead = tail.next;
            newNode.next= currentHead;
            tail.next=newNode;
            size++;
            return;
        }
        if(index==size){
            Node currentHead = tail.next;
            newNode.next= currentHead;
            tail.next=newNode;
            tail=newNode;
            size++;
            return;
        }
        Node temp = tail.next;
        Node prev = tail;
        int i=0;
        while(temp != tail && i < index){;
            i++;
            prev =temp;
            temp= temp.next;
        }
        prev.next = newNode;
        newNode.next= temp;
        size++;
        return;
    }


    /**************************************************************
     *deleteAtFirst
     *deleteAtLast
     *deleteAtPosition(index)
     **************************************************************/








    /**************************************************************
     *inner class
     **************************************************************/

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }





}
