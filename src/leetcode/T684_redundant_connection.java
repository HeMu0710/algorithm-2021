package leetcode;

public class T684_redundant_connection {

    // https://leetcode-cn.com/problems/redundant-connection/submissions/

    public int[] findRedundantConnection(int[][] edges) {
        for (int i = edges.length - 1; i >= 0 ; i--) {
            UnionFind unionFind = new UnionFind(edges.length + 1);
            for (int j = 0; j < edges.length; j++) {
                if (i != j) {
                    unionFind.union(edges[j][0], edges[j][1]);
                }
            }
            if (unionFind.getCount() == 1) return edges[i];
        }
        return edges[0];
    }

    private class UnionFind {
        private int[] parent;
        private int count;

        public UnionFind(int size) {
            this.parent = new int[size];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }
            this.count = size - 1;
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
                // 合并
                parent[xRoot] = parent[yRoot];
                count --;
            }
        }

        public int getCount() {
            return this.count;
        }
    }
}
