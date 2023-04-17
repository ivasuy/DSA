package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Levelorder {
    void printLevelorder(Node node){

        Queue<Node> qu = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        qu.offer(node);

        while(!qu.isEmpty()){
            int size = qu.size();

            for (int i = 0; i < size; i++) {
                if(qu.peek().left != null) qu.offer(qu.peek().left);
                if(qu.peek().right != null) qu.offer(qu.peek().right);
                list.add(qu.poll().data);
            }
        }
        System.out.print(list);
    }

    public static void main(String[] args) {

        Levelorder tree = new Levelorder();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        tree.printLevelorder(root);
    }
}
