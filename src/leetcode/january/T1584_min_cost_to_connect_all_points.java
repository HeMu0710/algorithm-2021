package leetcode.january;

import java.util.*;

public class T1584_min_cost_to_connect_all_points {

    // https://leetcode-cn.com/problems/min-cost-to-connect-all-points/

    public int minCostConnectPoints_1(int[][] points) {

        // 能过但超时

        List<int[]> connectedPoints = new ArrayList<>();
        int sumOfEdge = 0;
        connectedPoints.add(points[0].clone());
        points[0][0] = 1000001;
        while(true) {
            int minEdge = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int[] connectedPoint: connectedPoints) {
                for (int i = 0; i < points.length; i++) {
                    int[] point = points[i];
                    if (point[0] == 1000001) continue;
                    int edge = Math.abs(connectedPoint[0] - point[0]) + Math.abs(connectedPoint[1] - point[1]);
                    if (edge < minEdge) {
                        minEdge = edge;
                        minIndex = i;
                    }
                }
            }
            if (minEdge == Integer.MAX_VALUE) {
                return sumOfEdge;
            } else {
                sumOfEdge += minEdge;
                connectedPoints.add(points[minIndex].clone());
                points[minIndex][0] = 1000001;
            }
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int ans = 0;
        int length = points.length;
        int[] connected = new int[length];
        Arrays.fill(connected, 0);
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                edges.add(new Edge(i, j, Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1])));
            }
        }
        Collections.sort(edges);
        connected[0] = 1;
        for (int i = 0; i < length - 1; i++) {
            for (Edge edge : edges) {
                if (connected[edge.getX()] != connected[edge.getY()]) {
                    if (connected[edge.getX()] == 1) connected[edge.getY()] = 1;
                    else connected[edge.getX()] = 1;
                    ans += edge.edge;
                    break;
                }
            }
        }
        return ans;
    }

    private class Edge implements Comparable<Edge>{
        private int x;
        private int y;
        private int edge;

        public Edge(int x, int y, int edge) {
            this.x = x;
            this.y = y;
            this.edge = edge;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getEdge() {
            return edge;
        }

        public void setEdge(int edge) {
            this.edge = edge;
        }

        @Override
        public int compareTo(Edge o) {
            return this.edge - o.edge;
        }
    }

    public static void main(String[] args) {
        T1584_min_cost_to_connect_all_points solution = new T1584_min_cost_to_connect_all_points();
        int[][] input = new int[5][2];
        input[0][0] = 0;
        input[0][1] = 0;
        input[1][0] = 2;
        input[1][1] = 2;
        input[2][0] = 3;
        input[2][1] = 10;
        input[3][0] = 5;
        input[3][1] = 2;
        input[4][0] = 7;
        input[4][1] = 0;
        System.out.println(solution.minCostConnectPoints(input));
    }
}
