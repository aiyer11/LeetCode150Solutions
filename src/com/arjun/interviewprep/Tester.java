package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.MedianOfTwoSortedArraysSolution;
import com.arjun.interviewprep.BinarySearch.SearchInRotatedArraySolution;
import com.arjun.interviewprep.BinarySearch.TimeMap;

public class Tester {
    public static void main(String[] args){
        MedianOfTwoSortedArraysSolution solution = new MedianOfTwoSortedArraysSolution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
}
