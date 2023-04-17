package binaryTree;

import java.util.Stack;

public class Inorder {
    void printInorder(Node node){

//        if(node == null) return;
//        printInorder(node.left);
//        System.out.print(node.data + " ");
//        printInorder(node.right);

    }

    public static void main(String[] args) {

        Inorder tree = new Inorder();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder Traversal : ");
        tree.printInorder(root);
    }
//    T.C -> O(n)
}
