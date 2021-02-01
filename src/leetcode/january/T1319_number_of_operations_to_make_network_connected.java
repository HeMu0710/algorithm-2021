package leetcode.january;

public class T1319_number_of_operations_to_make_network_connected {

    // https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/

    public int makeConnected(int n, int[][] connections) {
        if (n > connections.length + 1) return -1;
        UnionFind uf = new UnionFind(n);
        for (int[] connection: connections) {
            uf.union(connection[0], connection[1]);
        }
        return uf.getCount() - 1;
    }

    class UnionFind {
        private int[] parent;
        private int count;

        UnionFind(int size) {
            this.parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
            count = size;
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

        int getCount() {
            return this.count;
        }
    }
}
