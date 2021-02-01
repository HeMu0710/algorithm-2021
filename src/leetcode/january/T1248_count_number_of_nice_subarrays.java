package leetcode.january;

public class T1248_count_number_of_nice_subarrays {

    // https://leetcode-cn.com/problems/count-number-of-nice-subarrays/

    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;
        int odd = 0; //奇数个数
        int[] mp = new int[nums.length + 1]; //记录有x个奇数的点的位置出现的次数
        mp[0] = 1;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] % 2 == 1) odd ++;
            if (odd >= k)
                ans += mp[odd - k];
            mp[odd] += 1;
        }
        return ans;
    }
}
