package com.linkedlist.sll_implementation;

import javax.swing.plaf.ColorUIResource;

public class SLL {

    public Node head;
    public Node tail;
    int size;

    //Step1-Constructor
    public SLL(){
        head= null;
        tail=null;
        size=0;
    }

    /**************************************************************
     *size n isEmpty started
     **************************************************************/
    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size==0?true:false;
    }

    /**************************************************************
     *size n isEmpty completed
     **************************************************************/


    /**************************************************************
     *display function implementation started
     **************************************************************/
     public void display(){
         if(head==null){
             System.out.println("Linked List is Empty");
             return;
         }

         Node temp = head;
         while(temp !=null){
             System.out.print(temp.data+ " => ");
             temp=temp.next;
         }

         System.out.println("null");
     }
     public void displayForwardRecursion(Node temp){
         if(temp==null){
             System.out.println("null");
             return;
         }
         System.out.print(temp.data+" => ");
         displayForwardRecursion(temp.next);
     }

    public void displayReverseBackTracking(Node temp){
        if(temp==null){
            return;
        }
        displayReverseBackTracking(temp.next);
        if(temp==head){
            System.out.print(temp.data); //Backtracking
        }else{
            System.out.print(temp.data+" => "); //Backtracking
        }

    }

    /**************************************************************
     *display function implementation completed
     **************************************************************/

    /**************************************************************
     *insert function
     *
     * 1. insertAtFirst
     * 2. insertAtLast
     * 3. insertAtPosition(data, index)
     *
     **************************************************************/



    public void insertAtFirst(int data){
        /**
         * Time Complexity -> O(1)
         */
        //case1 -----> empty LinkedList
        Node newNode = new Node(data, null); //start next always null
        if(this.head==null){
            this.head = this.tail = new Node(data, null);
        }else{
            //case2 -----> new head node for non empty ll
            newNode.next = this.head;
            this.head= newNode;
        }
        this.size++;
        return;
    }

    public void insertAtLast(int data){
        /**
         * Time Complexity -> O(1)
         */
        //case1 -----> empty LinkedList
        Node newNode = new Node(data, null); //start next always null
        if(this.head==null){
            this.head = this.tail = new Node(data, null);
        }else{
            //case2 -----> new head node for non empty ll
            this.tail.next= newNode;
            this.tail= newNode;
        }
        this.size++;
        return;
    }

    public void insertAtPosition(int data, int index){
        //TimeComplexity = O(n)
        Node newNode = new Node(data, null);
        /*
         * Edge Condition 1
         * index cant be less then zero.
         * index cant be  greater then size.
         * if index = size , element is new tail
         * if index < size element is intermediate element
         */
        if(index <0 || index>size){
            System.out.println("Out Of Range");
            return;
        }
        /*
         * Edge Condition 2
         * if head is null add the given element as new head no matter the index
         */
        if(head ==null){
            this.head= this.tail=newNode;
            this.size++;
            return;
        }
        /*
         * Edge Condition 3
         * if index 0 , new element act as new head
         */
        if(index==0){
          newNode.next= head;
          this.head= newNode;
          this.size++;
          return;
        }

        // replace above two case insertAtFirst
        // if(head==null || index ==0){
        // insertAtFirst(data)
        // }

        /**
         * 1. iterate till index
         * 2. wheni =index is the position i need to insert new node
         * 3. newNode.next = temp.next
         * 4. temp.next = newNode
         */

        int i=0;
        Node temp= this.head;
        while(i<index-1){
            temp=temp.next;
            i= i+1;
        }
        /**
         * now i is index and temp hold last element
         * 2 cases.
         * newNode is intermediate node
         * newNode is new tail
         */
        if(temp==tail){
            this.tail= newNode;
        }else{
            newNode.next = temp.next;
        }
        temp.next=newNode;
        this.size++;
        return;
    }

    public void  sortInsertionInAscOrder(int data){
        Node newNode = new Node(data, null);
        this.size = this.size+1;
        /**
         * case 1 , head is null
         * case 2 , head data is larger then newNode : newNode is new head
         */
        if(this.head ==null){
            this.head= this.tail =newNode;
            return;
        }
        if(this.head.data>newNode.data){
            newNode.next= this.head;
            this.head= newNode;
            return;
        }
        /**
         *  case3,
         *  find position by comparing data
         *  a) newNode is intermediate
         *  b) newNode is new tail
         */
        Node temp = head;
        while(temp.next!=null && temp.next.data < newNode.data){
            temp= temp.next;
        }
        if(temp==this.tail){
            tail= newNode;
        }
        newNode.next =temp.next;
        temp.next = newNode;
        return;
    }




    public void  sortInsertionInDescOrder(int data){
        Node newNode = new Node(data, null);
        this.size = this.size+1;
        /**
         * case 1 , head is null
         * case 2 , head data is smaller then newNode : newNode is new head
         */
        if(this.head ==null){
            this.head= this.tail =newNode;
            return;
        }
        if(this.head.data<newNode.data){
            newNode.next= this.head;
            this.head= newNode;
            return;
        }
        /**
         *  case3,
         *  find position by comparing data
         *  a) newNode is intermediate
         *  b) newNode is new tail
         */
        Node temp = head;
        while(temp.next!=null && temp.next.data > newNode.data){
            temp= temp.next;
        }
        if(temp==this.tail){
            tail= newNode;
        }
        newNode.next =temp.next;
        temp.next = newNode;
        return;
    }




    /**************************************************************
     *delete function
     *
     * 1. deleteAtFirst
     * 2. deleteAtLast
     * 3. deleteAtPosition(index)
     * 4. deleteElement
     * 5. deleteElements
     **************************************************************/

    public void deleteAtFirst(){
        //Complexity = O(1)
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        if(this.head.next==null){ //or head.next==null
            this.head=this.tail=null;
        }else{
            this.head = this.head.next;
        }
        this.size=size-1;
    }

    public void deleteAtLast(){
        //Complexity = O(n)
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        if(this.head.next==null){
            this.head=this.tail=null;
            this.size=this.size-1;
            return;
        }

        /**
         * figure of out second last element
         */
        Node temp1, temp2;
        temp1= head;
        temp2= head.next;
        while(temp2.next !=null){
            temp1=temp1.next; //temp2
            temp2=temp2.next;
        }
        temp1.next=null;
        temp2=null;
        this.tail= temp1;
        this.size= this.size-1;
        return;
    }

    public void deleteAtPosition(int index) {
        if (this.head==null) {
            System.out.println("Empty Linked List");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index Or Empty Linked List");
            return;
        }
        //linked list with only one element
        if(index==0 && this.head.next==null){
            this.head=this.tail=null;
            this.size=0;
            return;
        }

        if(index==0 ){
            this.head=this.head.next;
            this.size=this.size-1;
            return;
        }

        /**
         * i=0 point head
         * i=size-1 point tail
         */

        int i=0;
        Node temp1, temp2;
        temp1 = head;
        temp2 = head.next;
        while(i <index-1){ // for 0th element iteration should nt happen
            temp1= temp1.next;
            temp2=temp2.next;
            i=i+1;
        }
        temp1.next=temp2.next;
        //remap tail if needed
        if(temp1.next==null){
            this.tail=temp1;
        }
        this.size= this.size-1;
        return;
    }

    public void deleteElement(int dataVal){
        if (this.head==null) {
            System.out.println("Empty Linked List");
            return;
        }
        /**
         * edge condition head.data = dataVal
         */
        if(head.data==dataVal){
            if(head.next==null){
                this.head=this.tail=null;
            }else{
                this.head = head.next;
            }
            this.size=this.size-1;
            return;
        }
        /**
         *data is not in head
         */
        Node temp1, temp2;
        temp1 = head;
        temp2 = head.next;
        while(temp2 != null ){
            if(temp2.data==dataVal){
                /*
                 * 2 case
                 * intermediate node
                 * tail node
                 */
                if(temp2.next==null){
                    temp1.next=null;
                    this.tail=temp1;
                }else{
                    temp1.next= temp2.next;
                }
                this.size=this.size-1;
                return;
            }
            temp1=temp2;
            temp2=temp2.next;
        }
        return;
    }
    public void deleteElements(int dataVal){
        if (this.head==null) {
            System.out.println("Empty Linked List");
            return;
        }
        /**
         * edge condition head.data = dataVal
         */
        while(head.data==dataVal){
            if(head.next==null){
                this.head=this.tail=null;
            }else{
                this.head = head.next;
            }
            this.size=this.size-1;
        }
        /**
         * at this point current head data
         * is not equal to dataVal
         */
        Node temp1, temp2;
        temp1 = head;
        temp2 = head.next;
        while(temp2 != null ){
            if(temp2.data==dataVal){
                /*
                 * 2 case
                 * intermediate node
                 * tail node
                 */
                if(temp2.next==null){
                    temp1.next=null;
                    this.tail=temp1;
                    temp2=null; //for exiting loop
                }else{
                    temp1.next= temp2.next;
                    temp2= temp1.next;
                }
                this.size=this.size-1;
                continue;
            }
            temp1=temp2;
            temp2=temp2.next;
        }
        return;


    }

    /**************************************************************
     *search function
     *
     * 1. boolean search(data)
     * 2. boolean searchRecursion(data, temp)
     * 3. int search(data)
     * 4. int searchRecursion(data , temp, index)
     **************************************************************/

    public boolean search(int dataVal){
        Node temp = head;
        if(head==null){
            return false;
        }
        while(temp !=null){
            if(temp.data== dataVal){
                return true;
            }
            temp= temp.next;
        }
        return false;
    }

    public boolean searchRecursion(int dataVal, Node node){
         if(node == null){
             return false;
         }
         if(node.data==dataVal){
             return true;
         }
     return searchRecursion(dataVal, node.next);
    }

    public int searchForIndex(int dataVal){
        Node temp = head;
        if(head==null){
            return -1;
        }
        int i=0;
        while(temp !=null){
            if(temp.data== dataVal){
                return i;
            }
            temp= temp.next;
            i= i+1;
        }
        return -1;
    }

    public int searchForIndexRecursion(int dataVal, Node node, int index){
        if(node==null){
            return -1;
        }
        if(node.data==dataVal){
            return index;
        }
        return searchForIndexRecursion(dataVal,node.next,index+1);
    }


    /**************************************************************
     *1. remove duplicates - <need a sorted linkedlist.>
     *2. copy linkedlist
     *6. compare
     *4. reverse linked list
     *5. nth element from head
     *6. nth element from tail
     **************************************************************/


    public void removeDuplicates(){
        if(head ==null || head.next==null){
            //empty or single element
            return;
        }
        Node temp= head;
        while(temp!=null){
            if(temp.data== temp.next.data){
                /**
                 * 2 cases:
                 * temp.next is intermediate node
                 * temp.next is tail node;
                 */
                if(temp.next.next==null){ //tail node
                    temp.next=null;
                    this.tail= temp;
                    this.size= this.size-1;
                    break;
                }else{
                    temp.next= temp.next.next;
                    this.size= this.size-1;
                }
            }else{
                temp= temp.next;
            }
        }

    }

    public SLL copyLinkedList(){
        Node newHead, newTail, tempNode, curNode;
        curNode= this.head;
        if(curNode==null){
            return new SLL();
        }
        if(curNode.next==null){
            SLL tempLi =new SLL();
            Node node = new Node(curNode.data, null);
            tempLi.head=tempLi.tail=node;
            tempLi.size=1;
            return tempLi;
        }
        //linked list with more then one element;
        int size=1;
        newHead= new Node(curNode.data, null);
        newTail= newHead;
        curNode= curNode.next;
        tempNode=null;
        while(curNode!=null){
            tempNode= new Node(curNode.data, null);
            newTail.next=tempNode;
            newTail= newTail.next; //means tempNode just created
            curNode= curNode.next;
            size=size+1;
        }
        SLL tempLi =new SLL();
        tempLi.head=newHead;
        tempLi.tail=newTail;
        tempLi.size=size;
        return tempLi;
    }

    public boolean compare(Node n1 , Node n2){
        if(n1==null  && n2==null){
            return true;
        }
        if(n1==null ||  n2 == null || n1.data != n2.data){
            return false;
        }

        return compare(n1.next,n2.next);
    }

    public void reverse(){
        if(head==null){
            return ;
        }
        if(head.next==null){
            return ;
        }
        if(head.next.next==null){ //only two element
            Node temp1= head.next;
            head.next=null;
            temp1.next=head;
            head=temp1;
            return;
        }

        Node temp1=head;
        Node temp2=head.next;
        Node temp3=head.next.next;
        while(temp3!=null){
            temp1.next=null;
            temp2.next=temp1;

        }
        return;

    }



























    /**************************************************************
    *inner class
    **************************************************************/

    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
