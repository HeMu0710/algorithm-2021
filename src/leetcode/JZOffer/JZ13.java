package leetcode.JZOffer;

import java.util.Arrays;

public class JZ13 {

    // https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/

    public int movingCount(int m, int n, int k) {
        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 10 + (i / 10) % 10 + i / 100 + j % 10 + (j / 10) % 10 + j / 100 > k)
                    map[i][j] = 0;
                else
                    map[i][j] = 1;
            }
        }
        return dfs(map, 0, 0);
    }

    public int dfs(int[][] map, int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length || map[x][y] != 1) return 0;
        map[x][y] = -1;
        return dfs(map, x - 1, y) + dfs(map, x + 1, y) + dfs(map, x, y - 1) + dfs(map, x, y + 1) + 1;
    }

    public static void main(String[] args) {
        JZ13 solution = new JZ13();
        System.out.println(solution.movingCount(5, 3, 4));
    }
}
