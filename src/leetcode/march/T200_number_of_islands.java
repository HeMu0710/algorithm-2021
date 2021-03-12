package leetcode.march;

public class T200_number_of_islands {

    // https://leetcode-cn.com/problems/number-of-islands/

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int zeroCount = 0;

        UnionFind uf = new UnionFind(rows * cols);

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (grid[i][j] == '1') {
                    if (i + 1 < rows && grid[i + 1][j] == '1') {
                        uf.union(i * cols + j, (i + 1) * cols + j);
                    }
                    if (j + 1 < cols && grid[i][j + 1] == '1') {
                        uf.union(i * cols + j, i * cols + j + 1);
                    }
                } else {
                    zeroCount ++;
                }
            }
        }
        return uf.count - zeroCount;
    }

    class UnionFind {
        int[] parent;
        int count;

        UnionFind(int size) {
            this.parent = new int[size];
            for (int i = 0; i < size; ++i) {
                parent[i] = i;
            }
            count = size;
        }

        int find(int x) {
            while (x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        void union(int x, int y) {
            int rootX = find(x), rootY = find(y);
            if (rootX != rootY){
                parent[rootX] = rootY;
                count --;
            }
        }
    }
}
