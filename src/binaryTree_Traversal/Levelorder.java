package binaryTree_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Levelorder {
    void printLevelorder(Node node){

        Queue<Node> qu = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        qu.offer(node);

        while(!qu.isEmpty()){
            Node root = qu.peek();
            list.add(root.data);
            qu.poll();
            if(root.left != null) qu.offer(root.left);
            if(root.right != null) qu.offer(root.right);
        }
        System.out.println(list);

    }

    public static void main(String[] args) {

        Levelorder tree = new Levelorder();

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

        tree.printLevelorder(root);
    }
}
