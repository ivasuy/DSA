package binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Preorder {

    void printPreorder(Node node){
//        if(node == null) return;
//        System.out.print(node.data + " ");
//        printPreorder(node.left);
//        printPreorder(node.right);

        Stack<Node> st = new Stack<>();
        ArrayList<Integer> pre = new ArrayList<>();
        st.push(node);

        while(!st.empty()){
            node = st.pop();
            pre.add(node.data);
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
        }
        System.out.println(pre);
    }

    public static void main(String[] args) {
        Preorder tree = new Preorder();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Preorder Traversal : ");
        tree.printPreorder(root);
    }
}
