package leetcode.january;

import java.util.Arrays;

public class T628_maximum_product_of_three_numbers {

    // https://leetcode-cn.com/problems/maximum-product-of-three-numbers/

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1]);
    }
}
