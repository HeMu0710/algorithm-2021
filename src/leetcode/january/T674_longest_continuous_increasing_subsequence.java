package leetcode.january;

public class T674_longest_continuous_increasing_subsequence {

    // https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int ans = 1;
        int count = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) count ++;
            if (nums[i] <= nums[i - 1] || i == n - 1){
                if (ans < count) {
                    ans = count;
                }
                count = 1;
            }
        }
        return ans;
    }
}
