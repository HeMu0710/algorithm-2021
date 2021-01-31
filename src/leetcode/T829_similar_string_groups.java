package leetcode;

public class T829_similar_string_groups {

    // https://leetcode-cn.com/problems/similar-string-groups/

    public int numSimilarGroups(String[] strs) {
        UnionFind uf = new UnionFind(strs.length);

        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (isSimilar(strs[i], strs[j])) {
                    uf.union(i, j);
                }
            }
        }
        return uf.getCount();
    }

    boolean isSimilar(String str1, String str2) {
        int count = 0;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                count ++;
            }
        }
        if (count > 2) return false;
        else return true;
    }

    class UnionFind {
        private int[] parent;
        int count;

        UnionFind(int size) {
            parent = new int[size];
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
