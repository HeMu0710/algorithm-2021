package leetcode.february;

public class T896_monotonic_array {

    // https://leetcode-cn.com/problems/monotonic-array/

    public boolean isMonotonic(int[] A) {
        if (A.length <= 2) {
            return true;
        }
        int i = 1;
        for (; i < A.length; i++) {
            if (!(A[i] >= A[i - 1])) {
                break;
            }
        }
        int j = 1;
        for (; j < A.length; j++) {
            if (!(A[j] <= A[j - 1])) {
                break;
            }
        }
        return i == A.length || j == A.length;
    }
}
