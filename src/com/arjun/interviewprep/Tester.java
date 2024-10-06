package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.KokosBananasSolution;
import com.arjun.interviewprep.BinarySearch.MinInRotatedArraySolution;
import com.arjun.interviewprep.BinarySearch.Search2DMatrixSolution;

public class Tester {
    public static void main(String[] args){

        MinInRotatedArraySolution solution = new MinInRotatedArraySolution();
        int[] piles = {3,4,5,6,1,2};
        System.out.println(solution.findMin(piles));
    }
}
