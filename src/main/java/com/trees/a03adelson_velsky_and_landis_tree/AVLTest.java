package com.trees.a03adelson_velsky_and_landis_tree;

public class AVLTest {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(5);
        tree.insert(1);
        tree.levelOrder();
        tree.delete(20);
        tree.levelOrder();
    }
}
