package leetcode.JZOffer;

public class JZ53_Ⅱ {

    // https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/

    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int mid = (j + i) / 2;
            if (nums[mid] != mid) j = mid;
            else i = mid + 1;
        }
        return i == nums.length - 1 && nums[i] == i ? i + 1 : i;
    }
}
