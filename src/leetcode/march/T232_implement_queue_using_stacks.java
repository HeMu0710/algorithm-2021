package leetcode.march;

import java.util.Stack;

public class T232_implement_queue_using_stacks {

    // https://leetcode-cn.com/problems/implement-queue-using-stacks/

    class MyQueue {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        /** Initialize your data structure here. */
        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stack1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (empty()) return -1;
            if (stack2.empty()) {
                while (!stack1.empty())
                    stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (empty()) return -1;
            if (stack2.empty()) {
                while (!stack1.empty())
                    stack2.push(stack1.pop());
            }
            return stack2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack1.empty() && stack2.empty();
        }
    }
}
