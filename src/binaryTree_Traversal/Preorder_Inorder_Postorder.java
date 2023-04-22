package binaryTree_Traversal;

import java.util.ArrayList;
import java.util.Stack;

public class Preorder_Inorder_Postorder {

    class Pair{
        Node node;
        int num;

        Pair(Node node, int num){
            this.node = node;
            this.num = num;
        }
    }

    public void preInPost(Node root){

        Stack<Pair> st = new Stack<>();
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        st.push(new Pair(root, 1));

        while(!st.empty()){

            Pair T = st.pop();

            if(T.num == 1){
                T.num++;
                pre.add(T.node.data);
                st.push(T);

                if(T.node.left != null) st.push(new Pair(T.node.left, 1));
            }

            else if(T.num == 2){
                T.num++;
                in.add(T.node.data);
                st.push(T);

                if(T.node.right != null) st.push(new Pair(T.node.right, 1));
            }

            else{
                post.add(T.node.data);
            }
        }

        System.out.println("Preorder: "+ pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);


    }

    public static void main(String[] args) {

        Preorder_Inorder_Postorder tree = new Preorder_Inorder_Postorder();
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

        tree.preInPost(root);


    }
}
