package leetcode;

import java.util.Arrays;

public class T1128_number_of_equivalent_domino_pairs {

    // https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/

    public int numEquivDominoPairs(int[][] dominoes) {
        int ans = 0;
        int[] arr = new int[100];
        for (int[] domino : dominoes) {
            Arrays.sort(domino);
            ans += arr[domino[0] * 10 + domino[1]] ++;
        }
        return ans;
    }
}
