package com.trees.a01binarytree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTree.BTreeNode rt = new BinaryTree.BTreeNode(30);
        rt.left = new BinaryTree.BTreeNode(25);
        rt.right = new BinaryTree.BTreeNode(40);
        rt.left.left = new BinaryTree.BTreeNode(20);
        rt.left.right = new BinaryTree.BTreeNode(15);
        rt.left.left.left = new BinaryTree.BTreeNode(10);
        rt.right.left = new BinaryTree.BTreeNode(50);
        bt.root=rt;

        /***
         *              30
         *           /     \
         *        25        40
         *       /   \      /
         *      20     15   50
         *    /
         *  10
         *
         *
         *  PreOT  -> 10 20 25 15 30 50 40
         *  InOT   -> 30 25 20 10 15 40 50
         *  PostOt -> 40
         *  LOT
         *
         */

        bt.preOrder();
        bt.inOrder();
        bt.postOrder();
        System.out.println("No of Nodes : "+bt.countNodes());
        bt.levelOrder();


    }
}
