package leetcode.JZOffer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JZ41 {

    // https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/

    class MedianFinder {

        Queue<Integer> minHeap;
        Queue<Integer> maxHeap;

        /** initialize your data structure here. */
        public MedianFinder() {
            minHeap = new PriorityQueue<>();
            maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        }

        public void addNum(int num) {
            if (minHeap.size() == 0 && maxHeap.size() == 0) {
                minHeap.add(num);
            } else {
                if (num >= minHeap.peek()) {
                    minHeap.add(num);
                } else {
                    maxHeap.add(num);
                }
            }
            if (minHeap.size() - maxHeap.size() > 1) {
                maxHeap.add(minHeap.poll());
            }
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            }
        }

        public double findMedian() {
            if (minHeap.size() == maxHeap.size()) return (minHeap.peek() + maxHeap.peek()) / 2.0;
            else return minHeap.peek();
        }
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
}
