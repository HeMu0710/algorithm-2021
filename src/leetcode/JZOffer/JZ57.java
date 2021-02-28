package leetcode.JZOffer;

public class JZ57 {

    // https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int s = nums[i] + nums[j];
            if (s == target) return new int[]{nums[i], nums[j]};
            if (s < target) i++;
            if (s > target) j--;
        }
        return null;
    }
}
