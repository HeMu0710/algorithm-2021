package leetcode.JZOffer;

public class JZ10_Ⅱ {

    // https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/

    public int numWays(int n) {
        if (n <= 1 ) return 1;
        int[] fibs = new int[n + 1];
        fibs[0] = 1;
        fibs[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibs[i] = (fibs[i - 1] + fibs[i - 2]) % 1000000007;
        }
        return fibs[n];
    }
}
