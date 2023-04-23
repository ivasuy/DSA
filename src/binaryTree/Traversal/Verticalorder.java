package binaryTree.Traversal;

import java.util.*;

public class Verticalorder {

        Node node;
        int vertical;
        int level;

        Pair(Node node, int vertical, int level){
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }
    public void printVertical(Node root){
        /*First add vertical than add level than node
        TreeMap stores value in sorted order so if vertical is -2 it will be at first index*/
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        /*BFS traversal so Queue*/
        Queue<Pair> qu = new LinkedList<>();
        qu.offer(new Pair(root, 0, 0));

        while (!qu.isEmpty()){
            Pair T = qu.poll();
            Node currNode = T.node;
            int vertical = T.vertical;
            int level = T.level;

            if(!map.containsKey(vertical)) map.put(vertical, new TreeMap<>());
            if(!map.get(vertical).containsKey(level)) map.get(vertical).put(level, new PriorityQueue<>());
            map.get(vertical).get(level).offer(currNode.data);

            if(currNode.left != null) qu.offer(new Pair(currNode.left, vertical - 1, level + 1));
            if(currNode.right != null) qu.offer(new Pair(currNode.right, vertical + 1, level + 1));
        }

        /*Now finally adding values*/
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        /*Iterating over each Level*/
        for(TreeMap<Integer,PriorityQueue<Integer>> e : map.values()){
            /*Creating a list for every level*/
            list.add(new ArrayList<>());
            /*Iterating over nodes for each level*/
            for(PriorityQueue<Integer> i : e.values()){
                while(!i.isEmpty()){
                    /*for first iteration size of list is 1
                    thus element is stored at index 0
                    Next time the size will be 2 hence element will be stored at 1*/
                    list.get(list.size() - 1).add(i.poll());
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Verticalorder tree = new Verticalorder();

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

        tree.printVertical(root);
        System.out.print("Vertical order : ");
    }
}
