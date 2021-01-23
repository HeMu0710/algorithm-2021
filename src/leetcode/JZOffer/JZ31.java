package leetcode.JZOffer;

import java.util.Stack;

public class JZ31 {

    // https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int n = pushed.length;
        int i = 0;
        for (int num: pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i ++;
            }
        }
        return stack.isEmpty();
    }

}
