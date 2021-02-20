package leetcode.JZOffer;

import java.util.Arrays;

public class JZ40 {

    // https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }
}
