package leetcode.february;

import java.util.HashMap;
import java.util.Map;

public class T697_degree_of_array {

    // https://leetcode-cn.com/problems/degree-of-an-array/

    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int[] x = map.get(nums[i]);
                x[0] ++;
                x[2] = i;
            }
        }
        int count = 0;
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            count = Math.max(count, entry.getValue()[0]);
        }
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            if (entry.getValue()[0] == count) {
                ans = Math.min(ans, entry.getValue()[2] - entry.getValue()[1]);
            }
        }
        return ans + 1;
    }
}

