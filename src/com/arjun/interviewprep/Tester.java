package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.SearchInRotatedArraySolution;

public class Tester {
    public static void main(String[] args){

       SearchInRotatedArraySolution solution = new SearchInRotatedArraySolution();
        int[] piles = {4,5,6,7,0,1,2};
        System.out.println(solution.search(piles,0));
    }
}
