package leetcode;

public class T239_sliding_window_maximum {
    // https://leetcode-cn.com/problems/sliding-window-maximum/

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) return nums;
        int max = 0;
        int left = 0;
        int right = k - 1;
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            if (nums[max] < nums[i]) max = i;
        }
        result[0] = nums[max];
        for (int i = 1; i <= nums.length - k; i++) {
            left ++;
            right ++;
            for (int j = left; j <= right; j++) {
                if (nums[right] > nums[max]) {
                    result[i] = nums[right];
                    max = right;
                    break;
                }
                if (max < left) {
                    int tempMax = j;
                    for (int l = left; l <= right; l++) {
                        if (nums[tempMax] < nums[l]) tempMax = l;
                    }
                    max = tempMax;
                    result[i] = nums[max];
                    break;
                } else {
                    if (nums[max] < nums[right]) max = right;
                    result[i] = nums[max];
                    break;
                }
            }
        }
        return result;
    }
}