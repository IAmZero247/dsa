package com.linkedlist;

import com.linkedlist.cdll_implementation.CDLL;
import com.linkedlist.csll_implementation.CSLL;

public class CSLL_Test {
    public static void main(String[] args) {
m1TestInsert();
    }
    public static void m1TestInsert(){
        CSLL ll = new CSLL();
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size);
        ll.insertAtFirst(30);
        //ll.insertAtLast(30);
        ll.display();
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" + ll.getHead() +", Tail:" +ll.tail);
        ll.insertAtFirst(20);
        ll.insertAtFirst(10);
        ll.insertAtFirst(5);
        ll.display(); //10<=>20<=>30<=>
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" +  ll.getHead() +", Tail:" +ll.tail);
        ll.insertAtLast(40);
        ll.insertAtLast(50);
        ll.display();//5<=>10<=>20<=>30<=>40<=>50
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" +  ll.getHead() +", Tail:" +ll.tail);
        ll.insertAtPosition(0,2);
        ll.display();//2<=>5<=>10<=>20<=>30<=>40<=>50
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" +  ll.getHead() +", Tail:" +ll.tail);
        ll.insertAtPosition(7,60);
        ll.display();//2<=>5<=>10<=>20<=>30<=>40<=>50<=>60
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" +  ll.getHead() +", Tail:" +ll.tail);
        ll.insertAtPosition(3,15);
        ll.display();//2<=>5<=>10<=>15<=>20<=>30<=>40<=>50<=>60
        System.out.println("IsEmpty: "+ ll.isEmpty() +", Size:" +ll.size +", Head:" +  ll.getHead() +", Tail:" +ll.tail);
    }

}
