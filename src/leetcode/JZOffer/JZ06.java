package leetcode.JZOffer;

import java.util.ArrayList;

public class JZ06 {

    // https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] result = new int[list.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[result.length - i - 1] = list.get(i);
        }
        return result;
    }

    /**
     * Definition for singly-linked list.
     */
     private class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
