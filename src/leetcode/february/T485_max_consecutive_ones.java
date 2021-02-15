package leetcode.february;

public class T485_max_consecutive_ones {

    // https://leetcode-cn.com/problems/max-consecutive-ones/

    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count ++;
            }
            if (nums[i] == 0 || i == nums.length - 1) {
                res = Math.max(res, count);
                count = 0;
            }
        }
        return res;
    }
}
