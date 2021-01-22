package leetcode.JZOffer;

public class JZ27 {

    // https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/

    public TreeNode mirrorTree(TreeNode root) {
        reverseTree(root);
        return root;
    }

    public void reverseTree(TreeNode node) {
        if (node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        reverseTree(node.right);
        reverseTree(node.left);
    }

    /**
     * Definition for a binary tree node.
     */
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
