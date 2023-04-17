package binaryTree;

public class BinaryTree {
    public static void main(String[] args) {

        Inorder in = new Inorder();
        Postorder po = new Postorder();
        Preorder pr = new Preorder();
        Levelorder le = new Levelorder();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder Traversal : ");
        in.printInorder(root);
        System.out.print(", Postorder Traversal : ");
        po.printPostorder(root);
        System.out.print(", Preorder Traversal : ");
        pr.printPreorder(root);
        System.out.print(", levelorder Traversal : ");
        le.printLevelorder(root);

    }
}
