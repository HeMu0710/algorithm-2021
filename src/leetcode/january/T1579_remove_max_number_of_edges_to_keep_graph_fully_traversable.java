package leetcode.january;

public class T1579_remove_max_number_of_edges_to_keep_graph_fully_traversable {

    // https://leetcode-cn.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int ans = 0;
        UnionFind alice = new UnionFind(n + 1);
        UnionFind bob = new UnionFind(n + 1);

        // 优先处理公共边
        for (int[] edge: edges) {
            if (edge[0] == 3) {
                if (!alice.union(edge[1], edge[2])) ans ++;
                bob.union(edge[1], edge[2]);
            }
        }

        // 处理独占边
        for (int[] edge: edges) {
            if (edge[0] == 1) {
                if (!alice.union(edge[1], edge[2])) ans ++;
            }
            if (edge[0] == 2) {
                if (!bob.union(edge[1], edge[2])) ans ++;
            }
        }
        return alice.getCount() != 1 || bob.getCount() != 1 ? -1: ans;
    }

    private class UnionFind {
        private int[] parent;
        private int count;

        UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
            count = size - 1;
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                parent[rootX] = rootY;
                count --;
                return true;
            } else {
                return false;
            }
        }

        int getCount() {
            return this.count;
        }
    }
}
