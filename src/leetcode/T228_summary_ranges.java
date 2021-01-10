package leetcode;

import java.util.ArrayList;
import java.util.List;

public class T228_summary_ranges {
    // https://leetcode-cn.com/problems/summary-ranges/
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        if (nums.length == 1) {
            result.add(nums[0] + "");
            return result;
        }
        Integer startNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 != nums[i]) {
                if (nums[i - 1] == startNum) {
                    result.add(startNum + "");
                } else {
                    result.add(startNum + "->" + nums[i - 1]);
                }
                startNum = nums[i];
            }
        }
        if (nums[nums.length - 2] + 1 != nums[nums.length - 1]) {
            result.add(nums[nums.length - 1] + "");
        } else {
            result.add(startNum + "->" + nums[nums.length - 1]);
        }
        return result;
    }
}
