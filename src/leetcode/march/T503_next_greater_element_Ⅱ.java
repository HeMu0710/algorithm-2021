package leetcode.march;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

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
        int len = nums.length;
        int[] ans = new int[len];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * len; i++) {
            while (!stack.empty() && nums[stack.peek()] < nums[i % len]) {
                ans[stack.pop()] = nums[i % len];
            }
            stack.push(i % len);
        }
        return ans;
    }
}
