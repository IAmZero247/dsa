package com.trees.a01binarytree;

public class BinaryTreeTest {

    public static void main(String[] args) {
        testingBasicMethods();
        testingCopyMethod();
        testingIsEqualsMethod();
    }
    public static void testingBasicMethods() {
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
        bt.levelOrder();
        System.out.println("No of Nodes : "+bt.countNodes());
        System.out.println("Sum of Nodes : "+BinaryTreeUtils.sumOfNodes(rt));
        System.out.println("Height Of Tree : "+bt.height());
        System.out.println("Height Of Node (First Left) : "+BinaryTreeUtils.height(rt.left));
        System.out.println("Height Of Node (First Right) : "+BinaryTreeUtils.height(rt.right));
        System.out.println("Max : "+bt.maxVal());
        System.out.println("Min : "+bt.minVal());
        System.out.println("Search 30 : "+bt.search(30));
        System.out.println("Search 20 : "+bt.search(20));
        System.out.println("Search 50 : "+bt.search(50));
        System.out.println("Search 80 : "+bt.search(80));
    }


    public static void testingIsEqualsMethod(){
        BinaryTree bt1 = new BinaryTree();
        BinaryTree.BTreeNode rt1 = new BinaryTree.BTreeNode(30);
        rt1.left = new BinaryTree.BTreeNode(25);
        rt1.right = new BinaryTree.BTreeNode(40);
        rt1.left.left = new BinaryTree.BTreeNode(20);
        rt1.left.right = new BinaryTree.BTreeNode(15);
        bt1.root=rt1;


        BinaryTree bt2 = new BinaryTree();
        BinaryTree.BTreeNode rt2 = new BinaryTree.BTreeNode(30);
        rt2.left = new BinaryTree.BTreeNode(25);
        rt2.right = new BinaryTree.BTreeNode(40);
        rt2.left.left = new BinaryTree.BTreeNode(20);
        rt2.left.right = new BinaryTree.BTreeNode(15);
        bt2.root=rt2;


        BinaryTree bt3 = new BinaryTree();
        BinaryTree.BTreeNode rt3 = new BinaryTree.BTreeNode(30);
        rt3.left = new BinaryTree.BTreeNode(25);
        rt3.right = new BinaryTree.BTreeNode(40);
        rt3.left.left = new BinaryTree.BTreeNode(20);
        rt3.left.right = new BinaryTree.BTreeNode(10);
        bt3.root=rt3;

        System.out.println(BinaryTreeUtils.isEqual(rt1,rt2));
        System.out.println(BinaryTreeUtils.isEqual(rt1,rt3));
    }


    public static void testingCopyMethod(){
        BinaryTree bt = new BinaryTree();
        BinaryTree.BTreeNode rt = new BinaryTree.BTreeNode(30);
        rt.left = new BinaryTree.BTreeNode(25);
        rt.right = new BinaryTree.BTreeNode(40);
        rt.left.left = new BinaryTree.BTreeNode(20);
        rt.left.right = new BinaryTree.BTreeNode(15);
        rt.left.left.left = new BinaryTree.BTreeNode(10);
        rt.right.left = new BinaryTree.BTreeNode(50);
        bt.root=rt;
        bt.levelOrder();
        BinaryTree btcopy = bt.copy();
        bt.levelOrder();
        btcopy.levelOrder();
        rt.right.left.val=45;
        rt.right.left.right = new BinaryTree.BTreeNode(70);
        bt.levelOrder();
        btcopy.levelOrder();
    }

}
