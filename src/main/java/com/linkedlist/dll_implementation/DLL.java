package com.linkedlist.dll_implementation;

public class DLL {
    /***
     * creation of dll
     * only change is wrt to insert and deletion
     */

    Node head;
    int size;

    public DLL() {
        this.head = null;
        this.size=0;
    }

    /**************************************************************
     *size, isEmpty, display
     **************************************************************/

    public boolean isEmpty(){
        return this.head==null;
    }

    public int size(){
        return this.size;
    }

    public void display(){
        if(head==null){
            System.out.println("Empty LinkedList");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"<=>");
            temp= temp.next;
        }
        System.out.println("null");
    }

    /**************************************************************
     *insert
     * 1.insertAtFirst
     * 2.insertAtLast
     * 3.insertAtPosition(data , index)
     **************************************************************/

     public void insertAtFirst(int data){
         Node newNode = new Node(data, null,null);
         size++;
         if(head==null){
             head= newNode;
             return;
         }
         /**
          * 1. link prev of current head to this new node
          * 2. newNode.next = head
          * 3. assign head to newNode
          */

         head.prev= newNode;
         newNode.next = head;
         head=newNode;
         return;
     }

    public void insertAtLast(int data){
        Node newNode = new Node(data, null,null);
        size++;
        if(head==null){
            head= newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return;
    }



    public void insertAtPosition(int data, int index){
        if(index<0 ||index>size){
            System.out.println("Invalid Index");
            return;
        }
        Node newNode = new Node(data, null,null);
        size++;
        if(head==null){
            head= newNode;
            return;
        }
        if(index==0){
            head.prev= newNode;
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp1= head;
        Node prev=null; //hold current value in iteration
        int i =0;
        while(temp1!=null && i<index){
            prev= temp1;
            temp1= temp1.next;
            i++;
        }
        prev.next=newNode;
        newNode.prev= prev;
        newNode.next=temp1;
        if(temp1!=null){ //edge condition if new tail
            temp1.prev=newNode;
        }
        return;


    }

    /**************************************************************
     *search
     *  1. using iteration
     *  2. using iteration return index
     **************************************************************/

    /**************************************************************
     *delete
     *  1. deleteAtFirst
     *  2. deleteAtLast
     **************************************************************/

    public void deteteAtFirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(head.next==null){ //linked list with only one element
            head=null;
            size--;
            return;
        }

        head = head.next;
        head.prev=null;
        size--   ;
        return;
    }

    public void deleteAtLast(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(head.next==null){ //linked list with only one element
            head=null;
            size--;
            return;
        }

        Node temp1 = head;
        Node prev=null;
        while(temp1.next!=null){
            prev= temp1;
            temp1= temp1.next;
        }

    }






    /**************************************************************
     *inner class
     **************************************************************/
     class Node{
        int data;
        Node next, prev;

         public Node(int data, Node next, Node prev) {
             this.data = data;
             this.next = next;
             this.prev = prev;
         }
     }
}
