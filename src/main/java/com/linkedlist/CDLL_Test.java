package com.linkedlist;

import com.linkedlist.cdll_implementation.CDLL;

public class CDLL_Test {
    public static void main(String[] args) {
    //m1TestInsert();
    //m2TestDelete();
        m2TestSearch();
    }

    public static void m1TestInsert(){
        CDLL ll = new CDLL();
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size);
        ll.insertAtFirst(30);
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.insertAtFirst(20);
        ll.insertAtFirst(10);
        ll.display(); //10<=>20<=>30<=>
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.insertAtLast(40);
        ll.insertAtLast(50);
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.display();
    }


    public static void m2TestDelete(){
        CDLL ll = new CDLL();
        ll.insertAtFirst(30);
        ll.insertAtFirst(20);
        ll.insertAtFirst(10);
        ll.insertAtLast(40);
        ll.insertAtLast(50);
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.display();
        ll.deleteAtFirst();
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.deleteAtFirst();
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.deleteAtLast();
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.deleteAtLast();
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.display();

    }



    public static void m2TestSearch(){
        CDLL ll = new CDLL();
        ll.insertAtFirst(30);
        ll.insertAtFirst(20);
        ll.insertAtFirst(10);
        ll.insertAtLast(40);
        ll.insertAtLast(50);
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.head +", Tail:" +ll.tail);
        ll.display();
        System.out.println("Search 10 :"+ ll.search(10));
        System.out.println("Search 30 :"+ ll.search(30));
        System.out.println("Search 50 :"+ ll.search(50));
        System.out.println("Search 70 :"+ ll.search(70));
        System.out.println("Search 10 :"+ ll.searchForIndex(10));
        System.out.println("Search 30 :"+ ll.searchForIndex(30));
        System.out.println("Search 50 :"+ ll.searchForIndex(50));
        System.out.println("Search 70 :"+ ll.searchForIndex(70));

    }




}
