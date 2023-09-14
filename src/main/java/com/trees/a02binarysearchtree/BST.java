package com.trees.a02binarysearchtree;

import com.trees.a01binarytree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BST {
    BSTNode root;
    public BST() {
    }

    public void preOrder(){
        BSTUtils.preOrderTraversal(root);
        System.out.println();
    }
    public void inOrder(){
        BSTUtils.inOrderTraversal(root);
        System.out.println();
    }
    public void postOrder(){
        BSTUtils.postOrderTraversal(root);
        System.out.println();
    }

    public void levelOrder(){
        BSTUtils.levelOrder(root);
        System.out.println();
        ;}
    public void insert(int data){
        BST.BSTNode newNode = new BST.BSTNode(data);
        if(root==null){
            root=newNode;
        }else{
            BSTUtils.insert(root,data);
        }
    }



    public void delete( int value){
        /*
         *1. node is not available in tree
         *2. delete leaf node
         *3. delete node which has only 1 child
         *4. delete node which has 2 childs
         */
        BSTUtils.delete(root, value);
    }

    public BST copy(){
        BST copy = new BST();
        BSTNode root = BSTUtils.copy(this.root);
        copy.root=root;
        return copy;
    }

    public void printInRange(int v1, int v2){
        if (v1>v2){
            int temp = v1;
            v1=v2;
            v2=v1;
        }
        BSTUtils.printRange(this.root,v1,v2);
        System.out.println();
    }

    public void printAllRootLeafPaths(){
        List<Integer> li = new ArrayList<>();
        BSTUtils.printAllRootLeafPaths(root,li);
        System.out.println();
    }





    public static class BSTNode{
        int val;
        BSTNode left;
        BSTNode right;

        public BSTNode(int val) {
            this.val = val;
        }
    }
}
