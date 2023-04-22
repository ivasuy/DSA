package binaryTree.Traversal;

import java.util.ArrayList;
import java.util.Stack;

public class Preorder {


        void printPreorder(Node node){
//            RECURSIVE APPROACH
//        if(node == null) return;
//        System.out.print(node.data + " ");
//        printPreorder(node.left);
//        printPreorder(node.right);

//            ITERATIVE APPROACH
            Stack<Node> st = new Stack<>();
            ArrayList<Integer> list = new ArrayList<>();
            st.push(node);

            while (!st.empty()){

                Node root = st.pop();
                list.add(root.data);
                if(root.right != null) st.push(root.right);
                if(root.left != null) st.push(root.left);

            }

            System.out.println(list);

    }

    public static void main(String[] args) {
        Preorder tree = new Preorder();

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

        System.out.print("Preorder Traversal : ");
        tree.printPreorder(root);
    }
}
