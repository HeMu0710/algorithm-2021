package leetcode.march;

public class T503_next_greater_element_Ⅱ {

    // https://leetcode-cn.com/problems/next-greater-element-ii/

    public int[] nextGreaterElements_violence(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; ++i) {
            int j;
            for (j = 0; j < len; ++j) {
                int idx = (i + j) % len;
                if (nums[idx] > nums[i]) {
                    res[i] = nums[idx];
                    break;
                }
            }
            if (j == len) res[i] = -1;
        }
        return res;
    }

    public int[] nextGreaterElements(int[] nums) {
        //TODO: 单调栈+循环数组
        return null;
    }
}
