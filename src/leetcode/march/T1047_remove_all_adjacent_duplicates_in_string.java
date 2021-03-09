package leetcode.march;

import java.util.Stack;

public class T1047_remove_all_adjacent_duplicates_in_string {

    // https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); ++i) {
            if (!stack.empty() && stack.peek() == S.charAt(i)) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
