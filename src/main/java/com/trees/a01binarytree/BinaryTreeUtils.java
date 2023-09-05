package com.trees.a01binarytree;

import com.linkedlist.sll_implementation.SLL;

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



    static boolean search(BinaryTree.BTreeNode node ,int data){
        if(node==null){
            return false;
        }
        if(node.val==data){
            return true;
        }
        if(search(node.left ,data))
            return true;
        if(search(node.right,data))
            return true;
        return false;
    }

    static int max(BinaryTree.BTreeNode node){
        int max,left ,right;
        if(node==null){
            return Integer.MIN_VALUE;
        }
        max=node.val;
        left = max(node.left);
        right = max(node.right);
        return Math.max(Math.max(left,right),max);
    }


    static int min(BinaryTree.BTreeNode node){
        int min,left ,right;
        if(node==null){
            return Integer.MAX_VALUE;
        }
        min=node.val;
        left = min(node.left);
        right = min(node.right);
        return Math.min(Math.min(left,right),min);
    }



    static int countNodes(BinaryTree.BTreeNode node){
        if (node==null){
            return 0;
        }
        int left =countNodes(node.left);
        int right =countNodes(node.right);
        return left+right+1;
    }

    static int sumOfNodes(BinaryTree.BTreeNode rnode){
        if (rnode==null){
            return 0;
        }
        int left =sumOfNodes(rnode.left);
        int right =sumOfNodes(rnode.right);
        return left+right+rnode.val;
    }

    static int height(BinaryTree.BTreeNode rnode){
        if (rnode==null){
            return 0;
        }
        int left =height(rnode.left);
        int right =height(rnode.right);
        return Math.max(left,right)+1;
    }

    static boolean isEqual(BinaryTree.BTreeNode n1, BinaryTree.BTreeNode n2){
        if(n1==null && n2 == null){
            return true;
        }
        if(n1==null || n2 ==null){
            return false;
        }
        return isEqual(n1.left, n2.left) && isEqual(n1.right,n2.right) && (n1.val==n2.val);
    }




    static  BinaryTree.BTreeNode copy(BinaryTree.BTreeNode node){
        if(node==null){
            return null;
        }else{
            BinaryTree.BTreeNode newNode = new BinaryTree.BTreeNode(node.val);
            newNode.left= copy(node.left);
            newNode.right= copy(node.right);
            return newNode;
        }
    }
}
