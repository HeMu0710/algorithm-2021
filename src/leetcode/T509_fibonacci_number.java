package leetcode;

public class T509_fibonacci_number {
    // https://leetcode-cn.com/problems/fibonacci-number/
    public int fib(int n) {
        if (n <= 1 ) return n;
        int[] fibs = new int[n + 1];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        return fibs[n];
    }
}
