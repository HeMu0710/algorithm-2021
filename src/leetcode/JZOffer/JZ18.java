package leetcode.JZOffer;

public class JZ18 {

    // https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null)
            return head;
        if (head.val == val)
            return head.next;
        ListNode cur = head;
        while(cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    // Definition for singly-linked list.
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }
}
