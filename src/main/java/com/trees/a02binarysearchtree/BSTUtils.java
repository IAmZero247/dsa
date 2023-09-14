package com.trees.a02binarysearchtree;

import com.trees.a01binarytree.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BSTUtils {

    public static void preOrderTraversal(BST.BSTNode node){
        if(node==null){
            return ;
        }
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal((node.right));
    }

    public static void inOrderTraversal(BST.BSTNode node){
        if(node==null){
            return ;
        }
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal((node.right));
    }

    public static void postOrderTraversal(BST.BSTNode node){
        if(node==null){
            return ;
        }
        postOrderTraversal(node.left);
        postOrderTraversal((node.right));
        System.out.print(node.val + " ");
    }


    public static BST.BSTNode insert (BST.BSTNode node , int data){
        BST.BSTNode newNode = new BST.BSTNode(data);
        if(node==null){
            System.out.println("Inserting : " + newNode.val);
            node=newNode;
            return newNode;
        }else{
            //duplicates are not allowed
            if(data<=node.val){
                node.left=insert(node.left,data);
                return node;
            }else{
                node.right=insert(node.right, data);
                return node;
            }
        }
    }



    public static BST.BSTNode delete(BST.BSTNode node , int value){

        /*
         *1. node is not available in tree
         *2. delete leaf node
         *3. delete node which has only 1 child
         *4. delete node which has 2 childs
         */

        if(node==null){
            //if call reach here recursively node is not available.
            return null;
        }
        if(node.val < value){
            // Traversing to Right Node
            node.right=delete(node.right,value);
        }else if(node.val>value){
            // Traversing to Right Node
            node.left=delete(node.left,value);
        }else{
            // We are in right Node
            if(node.left==null && node.right==null){
                //case1- Leaf Node
                node= null;
            }else if(node.left !=null && node.right==null){
                //case2- Node with 1 child
                node= node.left;
            }else if(node.right!=null && node.left==null){
                //case2- Node with 1 child
                node= node.right;
            }else{
                /**
                 * case3- Node with 2 child
                 * figure out inorder successor
                 * inorder succssor is minimum element in right subtree
                 */
                BST.BSTNode inOrderSuccessor =findMinInSubTree(node.right);
                node.val = inOrderSuccessor.val;
                //now delete inorder successor
                node.right=delete(node.right, inOrderSuccessor.val);
            }
        }
        return node;
    }

    private static BST.BSTNode findMinInSubTree(BST.BSTNode node){
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

    static void levelOrder(BST.BSTNode node){
        int level = 0;
        if(node==null){
            System.out.println("BST Tree is Empty");
            return;
        }
        //below act as queue
        Deque<BST.BSTNode> deque = new LinkedList<BST.BSTNode>();
        deque.addFirst(node); // enqueue
        deque.addFirst(null);
        System.out.print("Level 0 ->" );
        while (!deque.isEmpty()){
            BST.BSTNode temp = deque.removeLast(); //dequeue
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



    static String search(BST.BSTNode node ,int data){
        if(node==null){
            return "Node NotFound";
        }else if(node.val==data){
            return "Node Found";
        }else if (node.val>data){
           return search(node.left ,data);
        }else /*(node.val<data)*/{
           return  search(node.right,data);
        }
    }

    static int max(BST.BSTNode node){
        if(node==null){
            return -1;
        }
        while(node.right!=null){
            node=node.right;
        }
        return node.val;
    }


    static int min(BST.BSTNode node){
        if(node==null){
            return -1;
        }
        while(node.left!=null){
            node=node.left;
        }
        return node.val;
    }


    static int count(BST.BSTNode node){
        if(node==null){
            return 0;
        }
        int left= count(node.right);
        int right=count(node.left);
        return left+right+1;
    }

    static int sumOfAllNodes(BST.BSTNode node){
        if(node==null){
            return 0;
        }
        int left= sumOfAllNodes(node.right);
        int right=sumOfAllNodes(node.left);
        return left+right+node.val;
    }

    static int height(BST.BSTNode node){
        if(node==null){
            return 0;
        }
        int left= height(node.right);
        int right=height(node.left);
        return Math.max(left,right)+1;
    }


    static boolean isEqual(BST.BSTNode node1, BST.BSTNode node2){
        if(node1==null && node2==null){
            return true;
        }else if(node1!=null && node2==null){
            return false;
        }else if(node2!=null && node1==null){
            return false;
        }else{
            return  isEqual(node1.left, node2.left) && isEqual(node1.right, node2.right) && node1.val==node2.val;
        }

    }

    static BST.BSTNode copy(BST.BSTNode node){
        if(node==null){
            return null;
        }
        BST.BSTNode temp = new BST.BSTNode(node.val);
        temp.right =copy(node.right);
        temp.left =copy(node.left);
        return temp;
    }

    static BST.BSTNode removeLeafNodes(BST.BSTNode node){
        if(node==null){
            return null;
        }

        if(node.left==null && node.right==null){
            return null;
        }

        node.left=removeLeafNodes(node.left);
        node.right=removeLeafNodes(node.right);
        return node;

    }

   static void printRange(BST.BSTNode node , int v1 , int v2){
        if(node==null){
            return;
        }
        //Assume v1 always less then v2
        if(node.val>=v1 && node.val<=v2){
           // v1 root v2
            printRange(node.left, v1,v2);
            System.out.print(node.val + " ");
            printRange(node.right, v1,v2);
        }
        if(v1<=node.val && v2<node.val){
           //v1 v2 root
            printRange(node.left, v1,v2);
        }
        if(v1>=node.val && v2>=node.val){
           //root v1 v2
            printRange(node.right, v1,v2);
        }
   }


   public static void printAllRootLeafPaths(BST.BSTNode node, List<Integer> li ){
        if(node==null){
            return;
        }
       li.add(node.val);
        if(node.left==null && node.right==null){
            printPath(li);
            return;
        }
        printAllRootLeafPaths(node.right, li);
        printAllRootLeafPaths(node.left,li);
        li.remove(li.size()-1);
   }
   public static void printPath(List<Integer> li){
        System.out.print(li);
        System.out.print("->");
        int sum=0;
        for (int i:li) {
           sum+=i;
        }
       System.out.println(sum);
   }



}
