package leetcode.march;

import java.util.Arrays;
import java.util.Comparator;

public class T354_russian_doll_envelopes {

    // https://leetcode-cn.com/problems/russian-doll-envelopes/

    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length;
        if (len == 0) return 0;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        int[] f = new int[len];
        Arrays.fill(f, 1);
        int ans = 1;
        for (int i = 1; i < len; ++i) {
            for (int j = 0; j < i; ++j) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }
}
