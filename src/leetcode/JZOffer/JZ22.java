package leetcode.JZOffer;

public class JZ22 {

    // https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        int count = 0;
        while (head.next != null) {
            head = head.next;
            count ++;
        }
        while(count > k - 2) {
            temp = temp.next;
            count --;
        }
        return temp;
    }

    // Definition for singly-linked list.
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }

}
