package leetcode.JZOffer;

public class JZ39 {

    // https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0, count = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            votes += x == num ? 1 : -1;
        }
        return x;
    }
}
