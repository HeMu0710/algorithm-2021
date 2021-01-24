package leetcode.JZOffer;

import java.util.ArrayList;
import java.util.List;

public class JZ32_Ⅱ {

    // https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/

    List<List<Integer>> node=new ArrayList();

    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrder(root,0);
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
