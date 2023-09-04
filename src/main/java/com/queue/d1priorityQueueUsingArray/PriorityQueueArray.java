package com.queue.d1priorityQueueUsingArray;

import java.util.Arrays;

public class PriorityQueueArray {
    int front ,rear;
    /**
     * priority -> front will hold the highest logic
     *
     * in PQ using array
     *   1. rear always in index 0
     *   2. front always hold index[size]
     *
     * //sorted insert
     */
    Integer [] PQ;
    int size, capacity;

    public PriorityQueueArray(int capacity) {
        this.size = 0;
        this.capacity =capacity;
        front =rear =-1;
        PQ = new Integer[capacity];
    }

    boolean isEmpty(){
        return front==-1;
    }

    boolean isFull(){
       return rear==0 && front ==capacity-1 ;
    }

    int size(){
        return isEmpty()?0: front-rear+1;
    }

    void display(){

        if(isEmpty()){
            System.out.println("PQ is Empty");
            return;
        }

        for(int i =front ; i>=rear ;i--){
            System.out.print(PQ[i]+" ");
        }
        System.out.println( "<"+ Arrays.toString(PQ)+">");
        return;
    }



    void insert(int data){
       if( isFull()){
           System.out.println("PQ is Full");
           return;
       }
        System.out.println("Inserting :"+ data);
       if(isEmpty()){
           front=rear=0;
           PQ[front]= data;
           size++;
           return;
       }
       /**Highest element will keep in front
        *[left side of array];
        *
        *           1    2    3    4    5    6
        *           50   70   85  90
        * c1 95->                       95
        * c2 75->                  75   90
        *                      75  80
        *                break;
        **/

        if(data>=PQ[size-1]){
            //smallest one in left
            front++;
            PQ[front] =data;
            size++;
            return;
        }else{
            for(int i=size-1; i>=0; i--){
                if(data<PQ[i]){
                    PQ[i+1] =PQ[i];
                    PQ[i]=data;
                    continue;
                }else{
                    break;
                }
            }
            front++;
            size++;
            return;
        }
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("PQ is Empty");
            return;
        }
        if(front==rear){
            PQ[front] = null;
            front=rear=-1;
            size=0;
            return;
        }
        System.out.println("Inserting :"+ PQ[front]);
        PQ[front] = null;
        front--;
        size--;
        return;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("PQ is Empty");
            return -1;
        }
        return PQ[front];
    }

}
