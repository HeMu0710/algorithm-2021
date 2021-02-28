package leetcode.JZOffer;

import java.util.ArrayList;
import java.util.List;

public class JZ54 {

    // https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/

    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list.get(list.size());
    }

    void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTraversal(node.right, list);
        if (k <= 0) return;
        list.add(node.val);
        k--;
        inorderTraversal(node.left, list);
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
