package leetcode.march;

import java.util.ArrayList;
import java.util.List;

public class T54_spiral_matrix {

    // https://leetcode-cn.com/problems/spiral-matrix/

    public List<Integer> spiralOrder(int[][] matrix) {
        int x = 0, y = 0, dx = 0, dy = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < rows * cols; ++i) {
            ans.add(matrix[x][y]);
            matrix[x][y] = 101;
            if (dx == 0) {
                if (y + dy >= cols || y + dy < 0 || matrix[x][y + dy] > 100) {
                    dx = dy;
                    dy = 0;
                }
            } else {
                if (x + dx >= rows || x + dx < 0 || matrix[x + dx][y] > 100) {
                    dy = -1 * dx;
                    dx = 0;
                }
            }
            x += dx;
            y += dy;
        }
        return ans;
    }
}
