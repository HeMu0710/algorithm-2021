package leetcode;

public class T189_rotate_array {
    // https://leetcode-cn.com/problems/rotate-array/

    public void rotate(int[] nums, int k) {
        if (nums.length <= 1 || k == 0 || k % nums.length == 0) return;
        int[] nums2 = nums.clone();
        int target;
        for (int i = 0; i < nums.length; i++) {
            target = (i + k) % nums.length;
            nums[target] = nums2[i];
        }
    }
}
