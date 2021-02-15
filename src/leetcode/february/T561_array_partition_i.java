package leetcode.february;

import java.util.Arrays;

public class T561_array_partition_i {

    // https://leetcode-cn.com/problems/array-partition-i/

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
