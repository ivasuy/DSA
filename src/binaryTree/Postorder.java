package binaryTree;

public class Postorder {
    void printPostorder(Node node){
        if(node == null) return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Postorder tree = new Postorder();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Postorder Traversal : ");
        tree.printPostorder(root);
    }
}
