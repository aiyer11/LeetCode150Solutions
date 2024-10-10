package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.MedianOfTwoSortedArraysSolution;
import com.arjun.interviewprep.BinarySearch.SearchInRotatedArraySolution;
import com.arjun.interviewprep.BinarySearch.TimeMap;
import com.arjun.interviewprep.LinkedList.ListNode;
import com.arjun.interviewprep.LinkedList.RevereLinkedListSolution;

public class Tester {
    public static void main(String[] args){
        ListNode head = new ListNode(0,new ListNode(1,new ListNode(2, new ListNode(3))));
        RevereLinkedListSolution solution = new RevereLinkedListSolution();
        System.out.println(solution.reverseList(head).val);
    }
}
