package leetcode.JZOffer;

public class JZ55_Ⅰ {

    // https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/

    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    int findDepth(TreeNode node, int depth) {
        if (node == null) return depth;
        return Math.max(findDepth(node.left, depth + 1), findDepth(node.right, depth + 1));
    }


    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
