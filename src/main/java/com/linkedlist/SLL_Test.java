package com.linkedlist;

import com.linkedlist.sll_implementation.SLL;

public class SLL_Test {
    public static void main(String[] args) {
        //testingM1SizeAndIsEmpty();
        //testingM2ForwardNReversePrintingUsingRecursion();
        //testingM3Insertion();
        //testM4InsertAscOrder();
        //testM5InsertDescOrder();
        //testM5delete();
        //testM6deleteElement();
        //testM7search();
        //testM8removeDuplicates();
        //testM9copyLinkListAndCompare();
        testM10reverse();

    }



    public static void testingM1SizeAndIsEmpty(){
        SLL ll = new SLL();
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size());
        ll.insertAtFirst(5555);
        ll.insertAtFirst(4444);
        ll.insertAtFirst(3333);
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size());
        ll.display(); // 3333->4444->5555->null
        System.out.println();
    }

    public static void testingM2ForwardNReversePrintingUsingRecursion(){
        SLL ll = new SLL();
        ll.insertAtFirst(5555);
        ll.insertAtFirst(4444);
        ll.insertAtFirst(3333);
        ll.insertAtFirst(2222);
        ll.insertAtFirst(1111);

        ll.displayForwardRecursion(ll.head); // 1111->2222->3333->4444->5555->null
        ll.displayReverseBackTracking(ll.head); //5555->4444->3333->2222->1111
        System.out.println();
    }


    public static void testingM3Insertion(){
        SLL ll = new SLL();
        ll.insertAtFirst(5555);
        ll.insertAtFirst(4444);
        ll.insertAtFirst(3333);
        ll.display(); //3333->4444->5555
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());

        ll.insertAtPosition(2222,0);
        ll.display(); //2222->3333->4444->5555
        ll.insertAtLast(6666);
        ll.display(); //2222->3333->4444->5555->6666
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());

        ll.insertAtPosition(5353, 2);
        ll.display(); //2222->3333->5353->4444->5555->6666
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.insertAtPosition(5454, 5);//2222->3333->5353->4444->5555->5454->6666
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.insertAtPosition(7171, 7);//2222->3333->5353->4444->5555->5454->6666->7171
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.insertAtPosition(8181, 9);//Out Of Range//2222->3333->5353->4444->5555->5454->6666-7171
        ll.display();
        System.out.println();
    }

    public static void testM4InsertAscOrder(){
        SLL ll = new SLL();
        ll.sortInsertionInAscOrder(5555);
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.sortInsertionInAscOrder(4444);
        ll.sortInsertionInAscOrder(3333);
        ll.sortInsertionInAscOrder(6666);
        ll.sortInsertionInAscOrder(1111);
        ll.sortInsertionInAscOrder(2222);
        ll.display(); //1111->2222->3333->4444->5555->6666->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
    }

    public static void testM5InsertDescOrder(){
        SLL ll = new SLL();
        ll.sortInsertionInDescOrder(3333);
        ll.sortInsertionInDescOrder(4444);
        ll.sortInsertionInDescOrder(5555);
        ll.sortInsertionInDescOrder(6666);
        ll.sortInsertionInDescOrder(1111);
        ll.sortInsertionInDescOrder(2222);
        ll.display(); //6666->5555->4444->3333->2222->1111->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
    }

    public static void testM5delete(){
        SLL ll = new SLL();
        ll.sortInsertionInAscOrder(5555);
        ll.sortInsertionInAscOrder(4444);
        ll.sortInsertionInAscOrder(3333);
        ll.sortInsertionInAscOrder(6666);
        ll.sortInsertionInAscOrder(1111);
        ll.sortInsertionInAscOrder(2222);
        ll.sortInsertionInAscOrder(7777);
        ll.sortInsertionInAscOrder(8888);
        ll.sortInsertionInAscOrder(9999);


        ll.display(); //1111->2222->3333->4444->5555->6666->7777->8888->9999->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteAtFirst();
        ll.display(); //2222->3333->4444->5555->6666->7777->8888->9999->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteAtLast();
        ll.display(); //2222->3333->4444->5555->6666->7777->8888->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteAtPosition(0);
        ll.display(); //3333->4444->5555->6666->7777->8888->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteAtPosition(2);
        ll.display(); //3333->4444->6666->7777->8888->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteAtPosition(4);
        ll.display(); //3333->4444->6666->7777->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
    }


    private static void testM6deleteElement() {

        SLL ll = new SLL();
        ll.sortInsertionInAscOrder(6);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(3);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(2);
        ll.sortInsertionInAscOrder(1);
        ll.insertAtFirst(5);
        ll.insertAtFirst(5);
        ll.insertAtLast(7);
        //testing begins
        ll.display();
        ll.deleteElement(7);//5 => 5 => 1 => 2 => 3 => 5 => 5 => 6 => null
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteElement(5);// 5 => 1 => 2 => 3 => 5 => 5 => 6 => null
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteElement(3);// 5 => 1 => 2 => 5 => 5 => 6 => null
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.deleteElements(5);// 1 => 2=> 6 => null
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());

    }


    private static void testM7search() {

        SLL ll = new SLL();
        ll.sortInsertionInAscOrder(6);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(3);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(2);
        ll.sortInsertionInAscOrder(1);
        ll.insertAtFirst(5);
        ll.insertAtFirst(5);
        ll.insertAtLast(7);
        //testing begins
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        System.out.println("Search 2 -> " +ll.search(2));
        System.out.println("Search 7 -> " +ll.search(9));
        System.out.println("SearchRecursion 2 -> " +ll.searchRecursion(2, ll.head));
        System.out.println("SearchRecursion 7 -> " +ll.searchRecursion(7, ll.head));
        System.out.println("SearchIndex 2 -> " +ll.searchForIndex(2));//3
        System.out.println("SearchIndex 9 -> " +ll.searchForIndex(9)); //-1
        System.out.println("SearchIndex 7 -> " +ll.searchForIndex(7)); //8
        System.out.println("SearchIndex 5 -> " +ll.searchForIndex(5)); //0


        System.out.println("SearchForIndexRecursion 2 -> " +ll.searchForIndexRecursion(2,ll.head ,0));//3
        System.out.println("SearchForIndexRecursion 9 -> " +ll.searchForIndexRecursion(9,ll.head,0)); //-1
        System.out.println("SearchForIndexRecursion 7 -> " +ll.searchForIndexRecursion(7,ll.head, 0)); //8
        System.out.println("SearchForIndexRecursion 5 -> " +ll.searchForIndexRecursion(5, ll.head ,0)); //0


    }



    private static void testM8removeDuplicates() {

        SLL ll = new SLL();
        ll.sortInsertionInAscOrder(10);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(12);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(7);
        ll.sortInsertionInAscOrder(12);
        ll.sortInsertionInAscOrder(11);
        ll.sortInsertionInAscOrder(7);
        ll.sortInsertionInAscOrder(8);
        ll.sortInsertionInAscOrder(6);
        ll.sortInsertionInAscOrder(7);
        ll.sortInsertionInAscOrder(9);


        //testing begins
        ll.display(); //5->5->6->7->7->7->8->9->10->11->12->12
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.removeDuplicates();// 5->6->7->8->9->10->11->12
        ll.display();
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
    }


    private static void testM9copyLinkListAndCompare() {

        SLL ll = new SLL();
        ll.sortInsertionInAscOrder(10);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(12);
        ll.sortInsertionInAscOrder(5);
        ll.sortInsertionInAscOrder(7);
        ll.sortInsertionInAscOrder(12);
        ll.sortInsertionInAscOrder(11);
        ll.sortInsertionInAscOrder(7);
        ll.sortInsertionInAscOrder(8);
        ll.sortInsertionInAscOrder(6);
        ll.sortInsertionInAscOrder(7);
        ll.sortInsertionInAscOrder(9);
        //testing begins
        ll.display(); //5->5->6->7->7->7->8->9->10->11->12->12
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        SLL copy = ll.copyLinkedList();
        copy.display();
        System.out.println("Copy# IsEmpty :" +copy.isEmpty() +", Size:"+copy.size() + ", head:"+ copy.head.toString() +", tail:"+ copy.tail.toString());

        System.out.println("Compare : " +ll.compare(ll.head,copy.head));


    }


    public static void testM10reverse(){
        SLL ll = new SLL();
        ll.sortInsertionInDescOrder(3333);
        ll.sortInsertionInDescOrder(4444);
        ll.sortInsertionInDescOrder(5555);
        ll.sortInsertionInDescOrder(6666);
        ll.sortInsertionInDescOrder(1111);
        ll.sortInsertionInDescOrder(2222);
        ll.display(); //6666->5555->4444->3333->2222->1111->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
        ll.reverse();
        ll.display(); //1111->2222->3333->44444->5555->6666->null
        System.out.println("IsEmpty :" +ll.isEmpty() +", Size:"+ll.size() + ", head:"+ ll.head.toString() +" , tail:"+ ll.tail.toString());
    }







}
