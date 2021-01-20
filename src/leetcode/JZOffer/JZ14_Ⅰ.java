package leetcode.JZOffer;

public class JZ14_Ⅰ {

    // https://leetcode-cn.com/problems/jian-sheng-zi-lcof/

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, j * dp[i - j]));
            }
        }
        return dp[n];
    }

    public int integerBreak(int n) {

        /**
         * 数论题解，将数尽可能拆成更多的3
         * @see https://leetcode-cn.com/problems/integer-break/solution/343-zheng-shu-chai-fen-tan-xin-by-jyd/
         */

        if(n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if(b == 0) return (int)Math.pow(3, a);
        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3, a) * 2;
    }
}
