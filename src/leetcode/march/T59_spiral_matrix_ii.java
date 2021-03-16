package leetcode.march;

import java.util.Arrays;

public class T59_spiral_matrix_ii {

    // https://leetcode-cn.com/problems/spiral-matrix-ii/

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int x = 0, y = 0, dx = 0, dy = 1;
        for (int i = 1; i <= n * n; ++i) {
            res[x][y] = i;
            if (dx == 0) {
                if (y + dy >= n || y + dy < 0 || res[x][y + dy] != 0) {
                    dx = dy;
                    dy = 0;
                }
            } else {
                if (x + dx >= n || x + dx < 0 || res[x + dx][y] != 0) {
                    dy = -1 * dx;
                    dx = 0;
                }
            }
            x += dx;
            y += dy;
        }
        return res;
    }
}
