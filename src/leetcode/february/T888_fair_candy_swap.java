package leetcode.february;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T888_fair_candy_swap {

    // https://leetcode-cn.com/problems/fair-candy-swap/

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> set = new HashSet<>();
        for (int a: A) {
            set.add(a);
        }
        for (int b: B) {
            if (set.contains(b + delta)) {
                return new int[]{b + delta, b};
            }
        }
        return null;
    }
}
