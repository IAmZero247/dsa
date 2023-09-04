package com.trees.a01binarytree;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class BinaryTreeUtils {



    static void preOrder(BinaryTree.BTreeNode node){
        if(node==null){
            return;
        }
        preOrder(node.left);
        System.out.print(node.val + " ");
        preOrder(node.right);
    }




    static void inOrder(BinaryTree.BTreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val + " ");
        inOrder(node.left);
        inOrder(node.right);
    }


    static void postOrder(BinaryTree.BTreeNode node){
        if(node==null){
            return;
        }
        postOrder(node.right);
        System.out.print(node.val + " ");
        postOrder(node.left);
    }


    static void levelOrder(BinaryTree.BTreeNode node){
        int level = 0;
        //below act as queue
        Deque<BinaryTree.BTreeNode> deque = new LinkedList<BinaryTree.BTreeNode>();
        deque.addFirst(node); // enqueue
        deque.addFirst(null);
      System.out.print("Level 0 ->" );
      while (!deque.isEmpty()){
          BinaryTree.BTreeNode temp = deque.removeLast(); //dequeue
          if(temp==null){
              if(deque.isEmpty()){
                  break;
              }{
                  level++;
                 System.out.println();
                 System.out.print("Level "+ level +" ->");
                 deque.addFirst(null);
              }

          }else{
              System.out.print(temp.val +" ");
              if(temp.left !=null){
                  deque.addFirst(temp.left);
              }
              if(temp.right !=null){
                  deque.addFirst(temp.right);
              }
          }
      }
    }



    static int countNodes(BinaryTree.BTreeNode node){
        if (node==null){
            return 0;
        }
        int left =countNodes(node.left);
        int right =countNodes(node.right);
        return left+right+1;
    }
}
