package binaryTree_Traversal;

import java.util.*;

public class Verticalorder {

    class Pair{
        int vertical;
        int level;
        Node node;
        Pair(int vertical, int level, Node node){
            this.vertical = vertical;
            this.level = level;
            this.node = node;
        }
    }
    public void printVertical(Node root){
        /*First add vertical than add level than node
        TreeMap stores value in sorted order so if vertical is -2 it will be at first index*/
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        /*BFS traversal so Queue*/
        Queue<Pair> qu = new LinkedList<>();
        qu.offer(new Pair(0, 0, root));

        while (!qu.isEmpty()){
            Pair T = qu.poll();
            Node node = T.node;
            int currVertical = T.vertical;
            int currLevel = T.level;

            if(!map.containsKey(currVertical)) map.put(currVertical, new TreeMap<>());
            if(!map.get(currVertical).containsKey(currLevel)) map.get(currVertical).put(currLevel, new PriorityQueue<>());
            map.get(currVertical).get(currVertical).offer(node.data);

            /*Moving left vertical - 1 & level + 1*/
            if(node.left != null) qu.offer(new Pair(currVertical - 1, currLevel + 1, node.left));
            /*Moving right vertical + 1 & level + 1*/
            if(node.right != null) qu.offer(new Pair(currVertical + 1, currLevel + 1, node.right));
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
