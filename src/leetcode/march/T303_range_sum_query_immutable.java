package leetcode.march;

public class T303_range_sum_query_immutable {

    // https://leetcode-cn.com/problems/range-sum-query-immutable/

    class NumArray {

        int[] sums;

        public NumArray(int[] nums) {
            int len = nums.length;
            sums = new int[len + 1];
            sums[0] = 0;
            int sum = 0;
            for (int i = 0; i < len; ++i) {
                sum += nums[i];
                sums[i + 1] = sum;
            }
        }

        public int sumRange(int i, int j) {
            return sums[j + 1] - sums[i];
        }
    }
}
