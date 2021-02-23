package leetcode.JZOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JZ48 {
    
    // https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/

    public int lengthOfLongestSubstring(String s) {
        char[] sc = s.toCharArray();
        int n = sc.length;
        int start = 0, end = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        while (end < n) {
            set.add(sc[end]);
            if (set.size() < end - start + 1) {
                while (sc[start] != sc[end]) {
                    set.remove(sc[start]);
                    start++;
                }
                start ++;
            }
            ans = Math.max(ans, end - start + 1);
            end ++;
        }
        return ans;
    }

    public int lengthOfLongestSubstring_(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, ans = 0;
        for (int j = 0; j < s.length(); j++) {
            if (dic.containsKey(s.charAt(j))) {
                i = Math.max(i, dic.get(s.charAt(j)));
            }
            dic.put(s.charAt(j), j);
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
}
