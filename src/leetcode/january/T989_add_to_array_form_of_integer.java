package leetcode.january;

import java.util.*;

public class T989_add_to_array_form_of_integer {

    // https://leetcode-cn.com/problems/add-to-array-form-of-integer/

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList<>();
        for (int i = A.length - 1; i >= 0; i --) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K ++;
                sum -= 10;
            }
            ans.add(sum);
        }
        for (; K > 0; K /= 10) {
            ans.add(K % 10);
        }
        Collections.reverse(ans);
        return ans;
    }
}
