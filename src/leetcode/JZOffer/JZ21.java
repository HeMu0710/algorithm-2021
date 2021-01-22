package leetcode.JZOffer;

public class JZ21 {

    // https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/

    public int[] exchange(int[] nums) {
        if (nums.length < 2) return nums;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 != 1 && nums[j] % 2 != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] % 2 != 1) {
                j --;
                continue;
            }
            if (nums[j] % 2 != 0) {
                i ++;
                continue;
            }
            i ++;
            j --;
        }
        return nums;
    }
}
