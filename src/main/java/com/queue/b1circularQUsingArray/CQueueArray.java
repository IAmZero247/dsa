package com.queue.b1circularQUsingArray;

public class CQueueArray {
    int front ,rear ;
    final int capacity;
    int [] CQ;

    public CQueueArray(int capacity) {
        this.capacity = capacity;
        front =rear =-1;
        CQ=new int [capacity];
    }

    boolean isFull(){
        if((front==0 && rear==capacity-1)|| (rear+1==front)){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }

    int getSize(){
        if(isEmpty()){
            return 0;
        }
        if(front<=rear){
            return rear-front+1;
        }else{
            /**
             *  0  1  2  3  4  5
             *     RE      FR
             */
            int part1 = rear+1;
            int part2 = (capacity-1)-front+1;
            return part1+part2;
        }
    }


    void display(){
        if(isEmpty() ){
            System.out.println("Q is Empty");
            return;
        }
        if(rear>=front){
            for(int i=front; i<=rear;i++){
                System.out.print(CQ[i] + " ");
            }
        }else{
            for(int i=front; i<capacity;i++){
                System.out.print(CQ[i] + " ");
            }
            for(int i=0; i<=rear;i++){
                System.out.print(CQ[i] + " ");
            }
        }
        System.out.println();
        return;
    }


    void insert(int data){
        if(isFull()){ //size= CQ.length
            System.out.println("Q is Full");
            return;
        }
        System.out.println("Inserting Element :"+ data );
        if(isEmpty()){ //rear==front is considered as empty condition
            front=rear=0;
            CQ[rear]= data;
            return;
        }else{
            rear= (rear+1)%capacity;
            CQ[rear]= data;
            return;
        }
    }


    void delete(){
        if(isEmpty()){
            front=rear=-1;
            System.out.println("Q is Empty");
            return;
        }


        int temp = CQ[front];
        System.out.println("Deleted Element :"+ temp );
        CQ[front]= 0;
        if(front==rear){
           front=rear=-1;
           return;
        }else{
            /*
             *1   2   3    4   5
             *    RE           FR
             *
             *front++;
             *if(front==capacity){
             *front=0;
             *}
             */
         front = (front+1)%capacity;
         return;
        }
    }

}
