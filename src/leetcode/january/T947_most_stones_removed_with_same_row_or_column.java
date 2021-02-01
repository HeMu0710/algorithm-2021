package leetcode.january;

import java.util.HashMap;
import java.util.Map;

public class T947_most_stones_removed_with_same_row_or_column {

    // https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/

    public int removeStones(int[][] stones) {
        UnionFind unionFind = new UnionFind();
        for (int[] stone : stones) {
            unionFind.union(stone[0], stone[1] + 10000);
        }
        return stones.length - unionFind.getCount();
    }

    class UnionFind {

        private Map<Integer, Integer> parent;
        private int count;

        public int getCount() {
            return count;
        }

        public UnionFind() {
            this.parent = new HashMap<>();
        }

        public int find(int x) {
            if (!parent.containsKey(x)) {
                parent.put(x, x);
                count ++;
            }
            if (x != parent.get(x)) {
                parent.put(x, find(parent.get(x)));
            }
            return parent.get(x);
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) return;
            parent.put(rootX, rootY);
            count --;
        }
    }
}
