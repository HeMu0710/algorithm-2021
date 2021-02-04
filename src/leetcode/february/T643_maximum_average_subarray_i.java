package leetcode.february;

public class T643_maximum_average_subarray_i {

    // https://leetcode-cn.com/problems/maximum-average-subarray-i/

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = 1; i < nums.length - k + 1; i++) {
            int temp = sum - nums[i - 1] + nums[i + k - 1];
            max = Math.max(max, temp);
            sum = temp;
        }
        return max * 1.0 / k;
    }
}
