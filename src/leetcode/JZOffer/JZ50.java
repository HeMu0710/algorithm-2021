package leetcode.JZOffer;

public class JZ50 {

    // https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/

    public char firstUniqChar(String s) {
        int n = s.length();
        int[] dict = new int[26];
        for (int i = 0; i < n; i++) {
            dict[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < n; i++) {
            if (dict[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
