package leetcode;

import java.util.ArrayList;

public class T86_partition_list {
    //https://leetcode-cn.com/problems/partition-list/submissions/
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> smallerNums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) < x) {
                smallerNums.add(nums.get(j));
                nums.set(j, null);
            }
        }
        for (Integer num : nums) {
            if (num == null) continue;
            smallerNums.add(num);
        }
        ListNode resultHead = new ListNode(smallerNums.get(0));
        ListNode temp = resultHead;
        for (int i = 1; i < smallerNums.size(); i++) {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(smallerNums.get(i));
        }
        return resultHead;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

