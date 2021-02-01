package leetcode.january;

import java.util.ArrayList;
import java.util.List;

public class T830_positions_of_large_groups {
    // https://leetcode-cn.com/problems/positions-of-large-groups/
    public List<List<Integer>> largeGroupPositions(String s) {
        char[] ss = s.toCharArray();
        List<List<Integer>> result = new ArrayList<>();
        int count = 1;
        char lastChar = ' ';
        for (int i = 0; i < ss.length; i++) {
            char c = ss[i];
            if (c == lastChar) {
                count ++;
            }
            if (c != lastChar){
                if (count >= 3) {
                    ArrayList<Integer> bigStr = new ArrayList<>();
                    bigStr.add(i - count);
                    bigStr.add(i - 1);
                    result.add(bigStr);
                }
                count = 1;
            }
            if (i == ss.length - 1) {
                if (count >= 3) {
                    ArrayList<Integer> bigStr = new ArrayList<>();
                    bigStr.add(ss.length - count);
                    bigStr.add(ss.length - 1);
                    result.add(bigStr);
                }
            }
            lastChar = c;
        }
        return result;
    }
}
