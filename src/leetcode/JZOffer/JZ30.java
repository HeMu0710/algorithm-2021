package leetcode.JZOffer;

import java.util.Arrays;

public class JZ30 {

    // https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/

    class MinStack {

        private int[] data;
        private int tail;
        private int min = 0;

        /** initialize your data structure here. */
        public MinStack() {
            data = new int[20000];
            tail = -1;
        }

        public void push(int x) {
            tail ++;
            data[tail] = x;
            if (x < data[min]) {
                min = tail;
            }
        }

        public void pop() {
            if (min == tail) {
                min = 0;
                for (int i = 0; i < tail; i++) {
                    if (data[i] < data[min]) {
                        min = i;
                    }
                }
            }
            tail --;
        }

        public int top() {
            return data[tail];
        }

        public int min() {
            return data[min];
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */
}
