package leetcode.JZOffer;

public class JZ24 {

    // https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/

    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
