package binaryTree.Traversal;

import java.util.ArrayList;
import java.util.Stack;

public class Inorder {
    void printInorder(Node node){
//            RECURSIVE APPROACH
//        if(node == null) return;
//        printInorder(node.left);
//        System.out.print(node.data + " ");
//        printInorder(node.right);


//        ITERATIVE APPROACH
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        Node root = node;

        while (true){

            if(root != null){
                st.push(root);
                root = root.left;

            } else {

                if(st.empty()) break;

                root = st.pop();
                list.add(root.data);
                root = root.right;
            }

        }
        System.out.println(list);
    }

    public static void main(String[] args) {

        Inorder tree = new Inorder();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.print("Inorder Traversal : ");
        tree.printInorder(root);
    }
}
