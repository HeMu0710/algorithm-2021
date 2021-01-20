package leetcode.JZOffer;

public class JZ15 {

    // https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n & 1;
            n >>>= 1;
        }
        return ans;
    }

    public int hammingWeight_1(int n) {

        // n & (n - 1) 消去最右边的1

        int ans = 0;
        while (n != 0) {
            n = n & (n - 1);
            ans ++;
        }
        return ans;
    }
}
