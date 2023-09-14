package com.trees.a03adelson_velsky_and_landis_tree;

import com.linkedlist.sll_implementation.SLL;
import com.trees.a02binarysearchtree.BST;

import java.util.Deque;
import java.util.LinkedList;

public class AVLUtils {
    public static int height(AVL.AVLNode node){
        if(node==null){
            return 0;
        }
        return node.ht;
    }

    public static int getBalance(AVL.AVLNode node){
        if(node==null){
            return 0;
        }
        return height(node.left)- height(node.right);
    }

    static void levelOrder(AVL.AVLNode node){
        int level = 0;
        if(node==null){
            System.out.println("AVL Tree is Empty");
            return;
        }
        //below act as queue
        Deque<AVL.AVLNode> deque = new LinkedList<AVL.AVLNode>();
        deque.addFirst(node); // enqueue
        deque.addFirst(null);
        System.out.print("Level 0 ->" );
        while (!deque.isEmpty()){
            AVL.AVLNode temp = deque.removeLast(); //dequeue
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

    public static  AVL.AVLNode insert(AVL.AVLNode node, int value) {
        if(node==null){
            //here new node will get inserted after recursive action
            AVL.AVLNode newNode = new AVL.AVLNode(value);
            return newNode;
        }else if(node.val>value){
            node.left  = insert(node.left, value);
        }else if(node.val<value){
            node.right = insert(node.right, value);
        }else{
            // dont disturb tree if value is already in tree;
            // other wise duplicates are not allowed
            // no-back tracing for this case
            return node;
        }
        //backtracking - correct balanceFactor for each traversed node
        node.ht= Math.max(height(node.left), height(node.right)) +1;
        int bf =getBalance(node);
        /**
         * if bf > 1 ....this cares only left in if exp
         * if bf < 1 ....this cares only right in if exp
         *
         * dbn is disbalanced node
         * effectednode is y
         */
        if(bf>1 && value<node.left.val){
              /*        100dbn             50
               *     50          ---->  25     100
               *  25n   y                     y
               */
            return rightRotation(node);

        }
        if(bf>1 && value>node.left.val){
            /*        100dbn               100                75
             *     50          ---->     75        ---->   50      100
             *   y    75n             50                y
             *                      y
             */
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if(bf<-1 && value>node.right.val){
            /*        100dbn                     150
             *           150          ---->  100     200
             *         y    200n                y
             */
            return leftRotation(node);
        }
        if(bf<-1 && value<node.right.val){
            /*        100dbn               100                     125
             *             150      ---->     125        ---->  100      150
             *        125n     y                 150                         y
             *                                       y
             */
           node.right = rightRotation(node.right);
           return leftRotation(node);
        }
      return node;
    }

    public static AVL.AVLNode delete( AVL.AVLNode node , int value){
       if(node ==null){
           return null;
       }else if (node.val>value){
          node.left = delete(node.left, value);
       }else if (node.val<value){
           node.right= delete(node.right,value);
       }else{
           //value found
           /**
            * 1. node can be leaf node
            * 2. node has one child
            * 3. node has 2 child
            */
           if(node.left==null && node.right==null){
               //return null;
               node=null;
           }else if(node.left!=null && node.right==null){
               //return node.left;
               node =node.left;
           }else if(node.right!=null && node.left==null){
               //return node.right
               node=node.right;
           }else{
               AVL.AVLNode inOrderSuccessor =findMinInSubTree(node.right);
               node.val = inOrderSuccessor.val;
               //now delete inorder successor
               node.right=delete(node.right, inOrderSuccessor.val);
           }
           /**
            * if bf > 1 ....this cares only left in if exp
            * if bf < 1 ....this cares only right in if exp
            */

           int bf =getBalance(node);
           if(bf>1 && value<node.left.val){
               return rightRotation(node);
           }
           if(bf>1 && value>node.left.val){
               node.left = leftRotation(node.left);
               return rightRotation(node);
           }
           if(bf<-1 && value>node.right.val){
               return leftRotation(node);
           }
           if(bf<-1 && value<node.right.val){
               node.right = rightRotation(node.right);
               return leftRotation(node);
           }
       }
       return node;
    }

    public static AVL.AVLNode rightRotation(AVL.AVLNode disbalancedNode){
        AVL.AVLNode newRootForSubtree= disbalancedNode.left;
        AVL.AVLNode y = disbalancedNode.left.right;
        disbalancedNode.left = y;
        newRootForSubtree.right= disbalancedNode;
        disbalancedNode.ht= Math.max(height(disbalancedNode.left), height(disbalancedNode.right)) +1;
        newRootForSubtree.ht= Math.max(height(newRootForSubtree.left), height(newRootForSubtree.right)) +1;
        return newRootForSubtree;
    }
    public static AVL.AVLNode leftRotation(AVL.AVLNode disbalancedNode){
        AVL.AVLNode newRootForSubtree= disbalancedNode.right;
        AVL.AVLNode y = disbalancedNode.right.left;
        disbalancedNode.right=y;
        newRootForSubtree.left= disbalancedNode;
        disbalancedNode.ht= Math.max(height(disbalancedNode.left), height(disbalancedNode.right)) +1;
        newRootForSubtree.ht= Math.max(height(newRootForSubtree.left), height(newRootForSubtree.right)) +1;
        return newRootForSubtree;
    }

    private static AVL.AVLNode findMinInSubTree(AVL.AVLNode node){
        /**
         * INORDER successor is the smallest node in the right sub tree
         **/
        if(node.left!=null){
            while(node.left!=null){
                node=node.left;
            }
            return node;
        }else{
            return node;
        }
    }

}
