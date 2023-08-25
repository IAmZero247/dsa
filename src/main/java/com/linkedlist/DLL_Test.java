package com.linkedlist;

import com.linkedlist.dll_implementation.DLL;

public class DLL_Test {
    public static void main(String[] args) {
        testM2Insert();
    }
    public static void testM1SizeNisEmpty(){

    }

    public static void testM2Insert(){
        DLL dll = new DLL();
        dll.insertAtFirst(30);
        dll.insertAtFirst(20);
        dll.insertAtFirst(10);
        dll.insertAtLast(40);
        dll.insertAtLast(50);
        dll.display(); //10->20->30->40->50->null
        dll.insertAtPosition(5,0);
        dll.display(); //5->10->20->30->40->50->null
        dll.insertAtPosition(8,1);
        dll.display(); //5->8->10->20->30->40->50->null
        dll.insertAtPosition(16,3);
        dll.display(); //5->8->10->16->20->30->40->50->null
        dll.insertAtPosition(45,7);
        dll.insertAtPosition(60,9);
        dll.display();
    }
}
