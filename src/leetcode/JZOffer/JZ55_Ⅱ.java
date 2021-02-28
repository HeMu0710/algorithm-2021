package leetcode.JZOffer;

public class JZ55_Ⅱ {

    // https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/

    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    int recur(TreeNode node) {
        if (node == null) return 0;
        int left = recur(node.left);
        if (left == -1) return -1;
        int right = recur(node.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
