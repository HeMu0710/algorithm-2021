package leetcode.february;

import java.util.ArrayList;
import java.util.List;

public class T448_find_all_numbers_disappeared_in_an_array {

    // https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] > 0)
                nums[Math.abs(num) - 1] *= -1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }
}
