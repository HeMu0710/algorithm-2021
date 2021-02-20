package leetcode.JZOffer;

import java.util.Arrays;

public class JZ42 {

    // https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
