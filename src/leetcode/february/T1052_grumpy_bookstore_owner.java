package leetcode.february;

public class T1052_grumpy_bookstore_owner {

    // https://leetcode-cn.com/problems/grumpy-bookstore-owner/

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int n = customers.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += grumpy[i] == 0 ? customers[i] : 0;
        }
        for (int i = 0; i < X; i++) {
            sum += grumpy[i] == 1 ? customers[i] : 0;
        }
        int ans = sum;
        for (int i = 1; i <= n - X; i++) {
            sum -= grumpy[i - 1] == 1 ? customers[i - 1] : 0;
            sum += grumpy[i + X - 1] == 1 ? customers[i + X - 1] : 0;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
