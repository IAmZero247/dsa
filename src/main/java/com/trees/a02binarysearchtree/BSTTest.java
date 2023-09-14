package com.trees.a02binarysearchtree;

public class BSTTest {
    /**
     *
     * @param args
     *
     *            50
     *    30              70
     *  10   40         60   80
     * 5        45    55
     */

    public static void main(String[] args) {
        //bstTraversing();
        // bstInsertNDelete();
        //bstSearchMinMaxCountSumHeightCopy();
        //removeLeafNode();
        //printRanges();
        printNodeToLeafPaths();
    }




    public static void bstTraversing() {
        BST bt =  new BST();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(10);
        bt.insert(40);
        bt.insert(60);
        bt.insert(80);
        bt.insert(5);
        bt.insert(45);
        bt.insert(55);
        bt.inOrder();
        bt.preOrder();
        bt.postOrder();
        bt.levelOrder();
    }



    public static void bstInsertNDelete() {
        BST bt =  new BST();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(10);
        bt.insert(40);
        bt.insert(60);
        bt.insert(80);
        bt.insert(5);
        bt.insert(45);
        bt.insert(55);
        bt.levelOrder();
        System.out.println("Deleteing Testing Started");
        /*bt.delete(45);
         bt.delete(55);*/

        /*bt.delete(10);
        bt.delete(40);*/
        bt.delete(50);
        bt.levelOrder();

    }



    public static void bstSearchMinMaxCountSumHeightCopy() {
        BST bt =  new BST();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(10);
        bt.insert(40);
        bt.insert(60);
        bt.insert(80);
        bt.insert(5);
        bt.insert(45);
        bt.insert(55);
        bt.levelOrder();
        System.out.println(BSTUtils.search(bt.root, 60));
        System.out.println(BSTUtils.search(bt.root, 100));
        System.out.println("Min :" +BSTUtils.min(bt.root));
        System.out.println("Max :" + BSTUtils.max(bt.root));
        System.out.println("Count :" + BSTUtils.count(bt.root));
        System.out.println("Sum :" + BSTUtils.sumOfAllNodes(bt.root));
        System.out.println("Height :" + BSTUtils.height(bt.root));

        BST bt2 =  new BST();
        bt2.insert(50);
        bt2.insert(30);
        bt2.insert(70);
        bt2.insert(10);
        bt2.insert(40);
        bt2.insert(60);
        bt2.insert(80);
        bt2.insert(5);
        bt2.insert(45);
        bt2.insert(55);
        System.out.println("IsEqual :" + BSTUtils.isEqual(bt.root, bt2.root));
        BST bt3 =bt2.copy();
        bt3.levelOrder();
    }

    public static void removeLeafNode(){
        BST bt =  new BST();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(10);
        bt.insert(40);
        bt.insert(60);
        bt.insert(80);
        bt.insert(5);
        bt.insert(45);
        bt.insert(55);
        BST bt2 =bt.copy();
        BSTUtils.removeLeafNodes(bt2.root);
        bt2.levelOrder();
    }


    private static void printRanges() {
        BST bt =  new BST();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(10);
        bt.insert(40);
        bt.insert(60);
        bt.insert(80);
        bt.insert(5);
        bt.insert(45);
        bt.insert(55);
        bt.printInRange(25,65);
        bt.printInRange(5,45);
        bt.printInRange(55,85);
    }

    private static void printNodeToLeafPaths() {
        BST bt =  new BST();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(10);
        bt.insert(40);
        bt.insert(60);
        bt.insert(80);
        bt.insert(5);
        bt.insert(45);
        bt.insert(55);
        bt.printAllRootLeafPaths();
    }

}
