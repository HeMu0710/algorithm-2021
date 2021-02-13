package leetcode.JZOffer;

public class JZ33 {

    // https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/

    public boolean verifyPostorder(int[] postorder) {
        return verify(postorder, 0, postorder.length - 1);
    }

    boolean verify(int[] postorder, int i, int j) {
        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) ++p;
        int m = p;
        while (postorder[p] > postorder[j]) ++p;
        return p == j && verify(postorder, i, m - 1) && verify(postorder, m, j - 1);
    }
}
