package LeetCode;

import javax.swing.tree.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree235 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if ( root == null || root == p || root == q ){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if ( left == null ){
            return right;
        }
        if ( right == null ){
            return left;
        }
        else {
//             both left and right are not null we got our answere
            return root;
        }

    }
}
