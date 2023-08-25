package com.queue.c1dequeueUsingArray;

public class DequeueArray {

    int DQ[];
    int front ,rear ,capacity;
    public int size;

    public DequeueArray(int capacity) {
        DQ = new int[capacity];
        this.capacity = capacity;
        front=rear=-1;
        size=0;
    }


    boolean isFull(){
        if((front==0 && rear==capacity-1)|| (front == rear+1)){
            return true;
        }else{
           return  false;
        }
    }

    boolean isEmpty(){
        if((front==-1 || rear==-1)){
            return true;
        }else{
            return  false;
        }
    }

    int getSize(){
        /**
         *    case 1: f<r
         *    1  2  3  4  5  6
         *       f        r     =>s = r-f+1
         *
         *    case 2: r<f
         *    1  2  3  4  5  6
         *          r     f
         *
         *          p1 = r+1
         *          p2 = (capacity-1)- f+1;
         */
        if(isEmpty()){
            return 0;
        }
        if(front<=rear){
            return rear-front+1;
        }else{
            int p1= rear+1;
            int p2= (capacity-1)- front+1;
            return p1+p2;
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return;
        }
        if(front<=rear){
           for(int i =front ; i<=rear ;i++){
               System.out.print(DQ[i]+" ");
           }
           System.out.println();
           return;
        }else{
            for(int i =front ; i<capacity ;i++){
                System.out.print(DQ[i] +" ");
            }
            for(int i =0 ; i<=rear ;i++){
                System.out.print(DQ[i] +" ");
            }
            System.out.println();
            return;
        }
    }



    public void insertAtFront(int data){
        if(isFull()){
            System.out.println("Dequeue is Full");
            return;
        }
        System.out.println("Inserted Element At Front : " +data);
        if(isEmpty()){
            front=rear=0;
            DQ[front]=data;
            size++;
            return;
        }else{
            /***
             *    1  2  3  4  5
             *       f     r
             *    f
             */
            front=(front==0)?capacity-1:front-1;
            DQ[front]=data;
            size++;
            return;
        }
    }




    public void insertAtRear(int data){
        if(isFull()){
            System.out.println("Dequeue is Full");
            return;
        }

        System.out.println("Inserted Element At Rear : " +data);
        if(isEmpty()){
            front=rear=0;
            DQ[front]=data;
            size++;
            return;
        }else{
            /***
             *    1  2  3  4  5
             *       f     r
             *    f
             */
            rear=(rear+1)%capacity;
            DQ[rear]=data;
            size++;
            return;
        }
    }


    public void deleteAtFront(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return;
        }

        System.out.println("Deleted Element At Front : " + DQ[front]);
        if(front==rear){
            DQ[front]=0;
            front=rear-1;
            size--;
            return;
        }else{
            /***
             *    1  2  3  4  5
             *       f     r
             *    f
             */
            DQ[front]=0;
            front=(front+1)%capacity;
            size--;
            return;
        }
    }
    public void deleteAtRear(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return;
        }

        System.out.println("Deleted Element At Front : " + DQ[rear]);
        if(front==rear){
            DQ[rear]=0;
            front=rear-1;
            size--;
            return;
        }else{
            /***
             *    1  2  3  4  5
             *       f     r
             *          r
             */
            DQ[rear]=0;
            rear=(rear==0)? capacity-1:(rear-1);
            size--;
            return;
        }
    }
}
