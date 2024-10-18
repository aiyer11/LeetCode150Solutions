package com.arjun.interviewprep.LinkedList;

import java.util.ArrayList;

public class MergeKSortedLinkedListsSolution {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0)
        {
            return null;
        }

        while(lists.length > 1)
        {
            ArrayList<ListNode> mergedList = new ArrayList<>();
            for(int i = 0; i < lists.length; i+=2)
            {
                ListNode l1 = lists[i];
                ListNode l2 = i + 1 < lists.length? lists[i+1] : null ;
                mergedList.add(merge(l1, l2));
            }
            lists = mergedList.toArray(new ListNode[mergedList.size()]);
        }
        return lists[0];
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
        }

        if(l1 != null){
            curr.next = l1;
        }

        if(l2 != null){
            curr.next = l2;
        }
        return dummy.next;
    }

}
