package com.linkedlist.cdll_implementation;

public class CDLL {
    public Node head;
    public Node tail;
    public int size;

    public CDLL() {
        this.size = 0;
    }

    public boolean isEmpty(){
       return head==null || tail==null;
    }

    public int size(){
        return size;
    }


    public void display(){
        if( head== null){
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        //System.out.print(head.data +"<=>");
        while(temp.next!=head){
            System.out.print(temp.data +"<=>");
            temp= temp.next;
        }
        System.out.println(temp.data);
        return;
    }


    public void insertAtFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode.next=newNode.prev=newNode;
            size++;
            return;
        }
        newNode.next=head;
        /*Node currentTail = head.prev;
        currentTail.next = newNode;
        newNode.prev=currentTail;*/
        tail.next=newNode;
        newNode.prev=tail;
        //current head prev is fixed to new Node;
        head.prev= newNode;
        head=newNode;
        size++;
        return;
    }


    public void insertAtLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode.next=newNode.prev=newNode;
            size++;
            return;
        }
        tail.next= newNode;
        newNode.prev=tail;
        tail= newNode;
        head.prev=newNode;
        tail.next=head;
        size++;
        return;
    }


    public void deleteAtFirst(){
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        //new head is head.next;
        head= head.next;
        head.prev=tail;
        tail.next=head;
        size--;
        return;
    }

    public void deleteAtLast(){
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        //new tail is tail.prev;
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
        size--;
        return;
    }

    public boolean search(int dataVal){
        if(head==null){
            return false;
        }
        Node temp= head;
        while(temp.next!=head){
            if(temp.data==dataVal){
                return true;
            }
            temp=temp.next;
        }
        //for tail
        if(temp.data==dataVal){
            return true;
        }
        return false;
    }

    public int searchForIndex(int dataVal){
        if(head==null){
            return -1;
        }
        Node temp= head;
        int i=0;
        while(temp.next!=head){
            if(temp.data==dataVal){
                return i;
            }
            temp=temp.next;
            i=i+1;
        }
        //for tail
        if(temp.data==dataVal){
            return i;
        }
        return -1;
    }





    /**************************************************************
     *inner class
     **************************************************************/
    static class Node{
        Node next;
        Node prev;
        int data;

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
