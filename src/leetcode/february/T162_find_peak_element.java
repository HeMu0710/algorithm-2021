package leetcode.february;

public class T162_find_peak_element {

    // https://leetcode-cn.com/problems/find-peak-element/?utm_source=LCUS&utm_medium=ip_redirect&utm_campaign=transfer2china

    public int findPeakElement(int[] nums) {

        return findPeak(nums, 0, nums.length - 1);
    }

    public int findPeak(int[] nums, int start, int end) {
        if (end - start == 0) return start;
        if (end - start == 1) return nums[start] < nums[end] ? end : start;
        int mid = (start + end) / 2;
        if (mid == 0 && nums[mid] > nums[mid + 1]) return mid;
        if (mid == nums.length - 1 && nums[mid] > nums[mid - 1]) return mid;
        if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
        if (nums[mid] < nums[mid + 1]) {
            return findPeak(nums, mid, end);
        } else {
            return findPeak(nums, start, mid);
        }
    }
}
