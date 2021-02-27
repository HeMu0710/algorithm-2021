package leetcode.JZOffer;

public class JZ52 {

    // https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        boolean fa = false;
        boolean fb = false;
        while (pa != pb) {
            pa = pa.next;
            pb = pb.next;
            if (pa == null) {
                if (fa) {
                    return null;
                } else {
                    fa = true;
                    pa = headB;
                }
            }
            if (pb == null) {
                if (fb) {
                    return null;
                } else {
                    fb = true;
                    pb = headA;
                }
            }
        }
        return pa;
    }

// Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
