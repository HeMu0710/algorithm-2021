package leetcode.february;

import java.util.ArrayList;
import java.util.List;

public class T119_pascals_triangle_ii {

    // https://leetcode-cn.com/problems/pascals-triangle-ii/

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add(0);
            for (int j = i; j > 0; --j) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
