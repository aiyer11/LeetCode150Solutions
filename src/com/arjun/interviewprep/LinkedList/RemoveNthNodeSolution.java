package com.arjun.interviewprep.LinkedList;

public class RemoveNthNodeSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode right = head;
        ListNode left = dummy;

        while(n > 0) {
            right = right.next;
            n--;
        }

        while(right != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }
}
