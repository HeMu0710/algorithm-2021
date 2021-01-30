package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T778_swim_in_rising_water {

    // https://leetcode-cn.com/problems/swim-in-rising-water/

    public int swimInWater(int[][] grid){
        int n = grid.length;
        int total = n * n;
        UnionFind un = new UnionFind(total);
        List<int[]> edges = new ArrayList<int[]>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int serial = i * n + j;
                if(i < n - 1){
                    edges.add(new int[]{serial, (i + 1) * n + j, Math.max(grid[i][j], grid[i + 1][j])});
                }
                if(j < n - 1){
                    edges.add(new int[]{serial, i * n + j + 1, Math.max(grid[i][j], grid[i][j + 1])});
                }
            }
        }
        Collections.sort(edges, (e1, e2) -> e1[2] - e2[2]);
        int ans = 0;
        for(int[] edge : edges){
            int x = edge[0];
            int y = edge[1];
            int rank = edge[2];
            un.union(x, y);
            if(un.find(0) == un.find(total - 1)){
                ans = rank;
                break;
            }
        }
        return ans;
    }

    class UnionFind {
        private int[] parent;

        UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
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
            }
        }
    }
}
