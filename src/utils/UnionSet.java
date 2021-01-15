package utils;

public class UnionSet {
    private int[] parent;
    private int[] rank;

    public UnionSet(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int getSize() {
        return parent.length;
    }

    private int find(int p) {
        if (p < 0 || p >= parent.length) {
            throw new IllegalArgumentException("p is out of bound");
        }
        while (p != parent[p]) {
            parent[p]=parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public boolean isConnected(int q, int p) {
        return find(q) == find(p);
    }

    public void unionElement(int q, int p) {
        int qRoot = find(q);
        int pRoot = find(p);
        if (qRoot != pRoot) {
            //将元素少的合并到元素多的上
            if (rank[qRoot] > rank[pRoot]) {
                parent[pRoot] = qRoot;
            } else if (rank[qRoot] < rank[pRoot]) {
                parent[qRoot] = pRoot;
            } else {
                //rank[qRoot] == rank[pRoot]
                parent[qRoot] = pRoot;
                rank[pRoot] += 1;
            }
        }
    }

    public static void main(String[] args) {
        UnionSet union = new UnionSet(5);
        union.unionElement(0, 1);
        union.unionElement(3, 4);
        union.unionElement(1, 2);
        union.unionElement(2, 4);
    }
}