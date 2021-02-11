package leetcode.february;

import java.util.*;

public class T703_kth_largest_element_in_a_stream {

    // https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/

    class KthLargest {

        private PriorityQueue<Integer> pq;
        private int k;

        public KthLargest(int k, int[] nums) {
            pq = new PriorityQueue<>();
            this.k = k;
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            if (pq.size() < k)
                pq.offer(val);
            else if (val > pq.peek()) {
                pq.poll();
                pq.offer(val);
            }
            return pq.peek();
        }
    }

    /**
     * Your KthLargest object will be instantiated and called as such:
     * KthLargest obj = new KthLargest(k, nums);
     * int param_1 = obj.add(val);
     */
}
