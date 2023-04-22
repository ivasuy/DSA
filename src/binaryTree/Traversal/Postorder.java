package binaryTree.Traversal;

import java.util.ArrayList;
import java.util.Stack;

public class Postorder {
    void printPostorder(Node node){
//        if(node == null) return;
//        printPostorder(node.left);
//        printPostorder(node.right);
//        System.out.print(node.data + " ");

//        ITERATIVE APPROACH
        Node curr = node;
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        while(curr != null || !st.empty()){

            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }

            else{
                Node temp = st.peek().right;

                if(temp == null){
                    temp = st.peek();
                    list.add(temp.data);
                    st.pop();

//                    means elements are on right so add in ans
                    while(!st.empty() && temp == st.peek().right){
                        temp = st.peek();
                        list.add(temp.data);
                        st.pop();
                    }
                }
                else curr = temp;

            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Postorder tree = new Postorder();

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

        System.out.print("Postorder Traversal : ");
        tree.printPostorder(root);
    }
}
