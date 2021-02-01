package leetcode.january;

import java.util.Arrays;

public class T724_find_pivot_index {

    // https://leetcode-cn.com/problems/find-pivot-index/

    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 0) return -1;
        int sum = Arrays.stream(nums).sum();
        int right = sum - nums[0];
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (right == left) return i;
            if (i != n - 1) right -= nums[i + 1];
            left += nums[i];
        }
        return -1;
    }
}
