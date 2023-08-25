package com.queue.a1normalQUsingArray;

public class NQueueArray {

  //front is used to remove/dequeue
  //rear is used to add;
  int front ,rear ;
  final int capacity;
  int [] Q;

    public NQueueArray(int capacity) {
        this.capacity = capacity;
        front =rear =-1;
        Q=new int [capacity];
    }

    boolean isEmpty(){
        //front=-1
        return (front==rear && front==-1);
    }

    boolean isFull(){
        return rear==capacity-1;
    }

    int getSize(){
        return isEmpty()? 0: rear-front+1;
    }


    void display(){
        if(isEmpty()){
            System.out.println("Q is Empty/Underflow");
            return;
        }
        /**
         * iterate from front to rear
         */
        for(int i=front; i<=rear;i++){
            System.out.print(Q[i] + " ");
        }
        System.out.println();
        return;
    }


    void enqueue(int data){
        if(isFull()){ //size= Q.length
            System.out.println("Q is Full/Overflow");
            return;
        }
        if(front==-1){
            front++;
        }
        rear++;
        Q[rear]= data;
        System.out.println("Data Enqueued :"+ Q[rear] );//+",Front :" +front);
        return;
    }


    void dequeue(){
        if(isEmpty()){
            System.out.println("Q is Empty/Underflow");
            return;
        }
        int temp = Q[front];
        Q[front]= 0;
        if(rear==front || front==capacity-1){//>=
            //deleting last element
           front=rear=-1;
        }else{
            //front will be always below rear
           front++;
        }
        System.out.println("Data Dequeued :"+ temp );//+",Front :" +front);
        return;
    }



    void peek(){
        if(isEmpty()){
            System.out.println("Q is Empty");
            return;
        }
        System.out.println("Peeked Element :"+ Q[front] );
        return;
    }
}
