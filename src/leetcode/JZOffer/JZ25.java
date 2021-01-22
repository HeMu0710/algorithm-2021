package leetcode.JZOffer;

public class JZ25 {

    // https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = new ListNode(0);
        temp.next = ans;
        while (true) {
            if (l1 == null && l2 == null) {
                break;
            }
            if (l1 == null) {
                ans.next = l2;
                l2 = l2.next;
                ans = ans.next;
                continue;
            }
            if (l2 == null) {
                ans.next = l1;
                l1 = l1.next;
                ans = ans.next;
                continue;
            }
            if (l1.val < l2.val) {
                ans.next = l1;
                l1 = l1.next;
            } else {
                ans.next = l2;
                l2 = l2.next;
            }
            ans = ans.next;
        }
        return temp.next.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
