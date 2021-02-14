package leetcode.february;

public class T765_couples_holding_hands {

    // https://leetcode-cn.com/problems/couples-holding-hands/

    public int minSwapsCouples(int[] row) {
        int len = row.length;
        int n = len / 2;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < len; i += 2) {
            uf.union(row[i] / 2, row[i + 1] / 2);
        }
        return n - uf.getCount();
    }

    class UnionFind {
        int[] parent;
        int count;

        UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
            count = size;
        }

        int getCount() {
            return this.count;
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootX] = rootY;
                count --;
            }
        }
    }
}
