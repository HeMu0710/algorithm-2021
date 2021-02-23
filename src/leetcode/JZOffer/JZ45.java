package leetcode.JZOffer;

import java.util.Arrays;

public class JZ45 {

    // https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/

    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }
}
