package leetcode.january;

import java.util.ArrayList;
import java.util.List;

public class T1018_binary_prefix_divisible_by_5 {

    // https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList<>();

        int num = 0;
        for (int i = 0;i < A.length;i++) {
            num <<= 1;
            num += A[i];
            num %= 10;
            ans.add(num % 5 == 0);
        }
        return ans;
    }
}
