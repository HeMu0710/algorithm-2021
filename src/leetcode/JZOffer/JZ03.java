package leetcode.JZOffer;

public class JZ03 {
    public int findRepeatNumber(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] >= 1) return nums[i];
            count[nums[i]] += 1;
        }
        return 0;
    }
}
