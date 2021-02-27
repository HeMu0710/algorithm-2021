package leetcode.february;

import java.util.HashMap;

public class T395_longest_substring_with_at_least_k_repeating_characters {


    // https://leetcode-cn.com/problems/longest-substring-with-at-least-k-repeating-characters/

    public int longestSubstring(String s, int k) {
        int len = s.length();
        if (len < k) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            if (map.get(s.charAt(i)) < k) {
                return Math.max(longestSubstring(s.substring(0, i), k),longestSubstring(s.substring(i + 1, len), k));
            }
        }
        return len;
    }
}
