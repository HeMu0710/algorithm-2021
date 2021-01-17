package leetcode;

public class T547_number_of_provinces {

    // https://leetcode-cn.com/problems/number-of-provinces/

    public int findCircleNum(int[][] isConnected) {
        UnionFind unionFind = new UnionFind(isConnected.length);
        for (int i = 0; i < isConnected.length - 1; i++) {
            for (int j = i + 1; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) unionFind.union(i, j);
            }
        }
        return unionFind.getCount();
    }

    private class UnionFind {

        private int[] parent;
        private int count;

        public UnionFind(int size) {
            this.parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
            this.count = size;
        }

        public int find(int x) {
            if (parent[x] == x) return x;
            else {
                parent[x] = find(parent[x]);
                return parent[x];
            }
        }

        public void union(int x, int y) {
            int xRoot = find(x);
            int yRoot = find(y);
            if (xRoot != yRoot) {
                parent[xRoot] = yRoot;
                count --;
            }
        }

        public int getCount() {
            return count;
        }
    }
}
