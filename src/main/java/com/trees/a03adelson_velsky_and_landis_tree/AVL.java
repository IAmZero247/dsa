package com.trees.a03adelson_velsky_and_landis_tree;

public class AVL {

    AVLNode root;


    public AVL() {
    }

    public int heightOfTree(){
        if(root==null){
            return 0;
        }
        return root.ht;
    }

    public void levelOrder(){
        AVLUtils.levelOrder(this.root);
        System.out.println();
    }




    public void insert(int value){
        AVLNode node= AVLUtils.insert(root, value);
        this.root=node;
    }

    public void delete(int value){
        if(root==null){
            System.out.println("AVLTree is Empty");
            return;
        }
        AVLNode node= AVLUtils.delete(root, value);
    }










    public static class AVLNode{
        int val;
        AVLNode left;
        AVLNode right;

        int ht;

        public AVLNode(int val) {
            this.val = val;
            this.ht=1;
        }

        @Override
        public String toString() {
            return " {" +
                    "val=" + val +
                    ", ht=" + ht +
                    '}';
        }
    }
}
