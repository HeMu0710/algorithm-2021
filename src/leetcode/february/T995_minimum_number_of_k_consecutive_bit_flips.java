package leetcode.february;

import java.util.Arrays;

public class T995_minimum_number_of_k_consecutive_bit_flips {

    // https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips/

    //差分数组

    public int minKBitFlips(int[] A, int K) {
        int n = A.length;
        int[] diff = new int[n + 1];
        int ans = 0, revCnt = 0;
        for (int i = 0; i < n; i++) {
            revCnt += diff[i];
            if ((A[i] + revCnt) % 2 == 0) {
                if (i + K > n) {
                    return -1;
                }
                ans ++;
                revCnt ++;
                diff[i + K] --;
            }
        }
        return ans;
    }

    // 滑动窗口

    public int minKBitFlips_(int[] A, int K) {
        int n = A.length;
        int ans = 0, revCnt = 0;
        for (int i = 0; i < n; i++) {
            if (i >= K && A[i - K] > 1) {
                revCnt ^= 1;
                A[i - K] -= 2;
            }
            if (A[i] == revCnt) {
                if (i + K > n) {
                    return -1;
                }
                ans ++;
                revCnt ^= 1;
                A[i] += 2;
            }
        }
        return ans;
    }
}
