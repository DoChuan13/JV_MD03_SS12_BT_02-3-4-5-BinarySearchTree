package app.view;

import app.model.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        /* BST tree example
              45
           /     \
          10      90
         /  \    /
        7   12  50   */
        //insert data into BST
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(50);
        bst.insert(90);
        bst.insert(20);
        bst.insert(55);
        //print the BST
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();

        //delete leaf node
        System.out.println("\nThe BST after Delete 12(leaf node):");
        bst.deleteKey(12);
        bst.inorder();
        //delete the node with one child
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        bst.deleteKey(90);
        bst.inorder();

        //delete node with two children
        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bst.deleteKey(45);
        bst.inorder();
        //search a key in the BST
        boolean ret_val = bst.search(50);
        System.out.println("\nKey 50 found in BST:" + ret_val);
        ret_val = bst.search(12);
        System.out.println("\nKey 12 found in BST:" + ret_val);
    }
}