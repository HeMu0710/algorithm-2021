package leetcode.JZOffer;

public class JZ43 {

    // https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/

    public int countDigitOne(int n) {
        if (n == 0) return 0;
        int count = (n + "").length();
        if (count == 1) {
            return 1;
        }
        int x = (int) Math.pow(10, count - 1);
        int topN = n / x;
        if (topN == 1) {
            if (n == x) {
                return countDigitOne(n - 1) + 1;
            }
            return countDigitOne(x) + countDigitOne(n % x) + n % x;
        } else {
            return topN * countDigitOne(x) - (topN - 1) + x - 1 + countDigitOne(n % x);
        }
    }
}
