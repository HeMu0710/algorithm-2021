package leetcode.february;

public class T567_permutation_in_string {

    // https://leetcode-cn.com/problems/permutation-in-string/

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] chart = new int[26];
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            chart[c1[i] - 'a'] += 1;
        }
        int[] test = new int[26];
        for (int i = 0; i < c1.length; i++) {
            test[c2[i] - 'a'] += 1;
        }
        for (int j = 0; j < 26; j++) {
            if (chart[j] != test[j]) {
                break;
            }
            if (j == 25) return true;
        }
        for (int i = 1; i <= c2.length - c1.length; i++) {
            test[c2[i - 1] - 'a'] -= 1;
            test[c2[i + c1.length - 1] - 'a'] += 1;
            for (int j = 0; j < 26; j++) {
                if (chart[j] != test[j]) {
                    break;
                }
                if (j == 25) return true;
            }
        }
        return false;
    }
}
