package leetcode.JZOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JZ32_Ⅲ {

    // https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/comments/

    List<List<Integer>> node = new ArrayList();

    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrder(root,0);
        for (int i = 1; i < node.size(); i += 2) {
            Collections.reverse(node.get(i));
        }
        return node;
    }
    public void levelOrder(TreeNode root, int k){
        if(root!=null){
            if(node.size()<=k)node.add(new ArrayList());
            node.get(k).add(root.val);
            levelOrder(root.left,k+1);
            levelOrder(root.right,k+1);
        }
    }

    /**
     * Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
