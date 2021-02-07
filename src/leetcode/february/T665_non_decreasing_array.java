package leetcode.february;

public class T665_non_decreasing_array {

    // https://leetcode-cn.com/problems/non-decreasing-array/

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count ++;
                int temp = nums[i];
                nums[i] = nums[i + 1];
                if (i != 0 && nums[i - 1] > nums[i]) {
                    nums[i] = temp;
                    nums[i + 1] = nums[i];
                }
                i = -1;
            }
            if (count > 1) return false;
        }
        return true;
    }
}
