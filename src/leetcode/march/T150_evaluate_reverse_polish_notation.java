package leetcode.march;

import java.util.Stack;

public class T150_evaluate_reverse_polish_notation {

    // https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x + y);
            } else if (token.equals("-")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y - x);
            } else if (token.equals("*")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y * x);
            } else if (token.equals("/")) {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y / x);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
