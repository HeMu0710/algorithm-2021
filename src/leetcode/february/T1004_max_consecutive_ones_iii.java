package leetcode.february;

public class T1004_max_consecutive_ones_iii {

    // https://leetcode-cn.com/problems/max-consecutive-ones-iii/

    public int longestOnes(int[] A, int K) {
        int start = 0, end = 0;
        int zeroCnt = 0;
        int n = A.length;
        int ans = 0;
        while (end < n) {
            if (A[end] == 0) {
                zeroCnt ++;
            }
            if (zeroCnt > K) {
                while (start <= end && A[start] == 1) {
                    start ++;
                }
                start ++;
                zeroCnt --;
            }
            end ++;
            ans = Math.max(end - start, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        T1004_max_consecutive_ones_iii solution = new T1004_max_consecutive_ones_iii();
        int[] input = new int[]{0, 0, 0, 1};
        System.out.println(solution.longestOnes(input, 4));
    }
}
