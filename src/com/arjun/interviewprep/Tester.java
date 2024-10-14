package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.MedianOfTwoSortedArraysSolution;
import com.arjun.interviewprep.BinarySearch.SearchInRotatedArraySolution;
import com.arjun.interviewprep.BinarySearch.TimeMap;
import com.arjun.interviewprep.LinkedList.ListNode;
import com.arjun.interviewprep.LinkedList.ReorderLinkedListSolution;
import com.arjun.interviewprep.LinkedList.RevereLinkedListSolution;

public class Tester {
    public static void main(String[] args){
        ListNode head = new ListNode(2,new ListNode(4,new ListNode(6, new ListNode(8))));
        ReorderLinkedListSolution solution = new ReorderLinkedListSolution();
        solution.reorderList(head);
    }
}
