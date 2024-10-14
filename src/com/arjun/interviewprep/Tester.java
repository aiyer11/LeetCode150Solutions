package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.MedianOfTwoSortedArraysSolution;
import com.arjun.interviewprep.BinarySearch.SearchInRotatedArraySolution;
import com.arjun.interviewprep.BinarySearch.TimeMap;
import com.arjun.interviewprep.LinkedList.ListNode;
import com.arjun.interviewprep.LinkedList.RemoveNthNodeSolution;
import com.arjun.interviewprep.LinkedList.ReorderLinkedListSolution;
import com.arjun.interviewprep.LinkedList.RevereLinkedListSolution;

public class Tester {
    public static void main(String[] args){
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4))));
        RemoveNthNodeSolution removeNthNodeSolution = new RemoveNthNodeSolution();
        System.out.println(removeNthNodeSolution.removeNthFromEnd(head,2).val);
    }
}
