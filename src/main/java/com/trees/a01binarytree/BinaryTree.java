package com.trees.a01binarytree;

/**
 * binary tree traversals (inorder,preorder,postorder)
 * level order traversal
 * count nodes
 * sum of nodes
 * height of the tree
 * search operation
 * max element in BT
 * min element in BT
 * equality of two BTs
 * copy of tree
 */
public class BinaryTree {

    BTreeNode root;


    public BinaryTree() {
    }

    public void inOrder(){
        BinaryTreeUtils.inOrder(root);
        System.out.println();
    }
    public void preOrder(){
        BinaryTreeUtils.preOrder(root);
        System.out.println();
    }

    public void postOrder(){
        BinaryTreeUtils.postOrder(root);
        System.out.println();
    }

    public void levelOrder(){
        BinaryTreeUtils.levelOrder(root);
        System.out.println();
    }

    public int countNodes(){
        return BinaryTreeUtils.countNodes(root);
    }





    public static class BTreeNode{
        int val;
        BTreeNode left;
        BTreeNode right;

        public BTreeNode(int val) {
            this.val = val;
        }
    }
}
