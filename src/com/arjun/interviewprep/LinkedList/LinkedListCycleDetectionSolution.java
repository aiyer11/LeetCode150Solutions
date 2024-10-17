package com.arjun.interviewprep.LinkedList;

import java.util.ArrayList;

public class LinkedListCycleDetectionSolution {

    public boolean hasCycle(ListNode head){
       ListNode fast = head;
       ListNode slow = head;
        while(fast!= null && fast.next != null){
            if(fast.next == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
