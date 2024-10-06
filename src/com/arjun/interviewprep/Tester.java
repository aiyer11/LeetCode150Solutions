package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.KokosBananasSolution;
import com.arjun.interviewprep.BinarySearch.Search2DMatrixSolution;

public class Tester {
    public static void main(String[] args){

        KokosBananasSolution solution = new KokosBananasSolution();
        int[] piles = {25,10,23,4};
        System.out.println(solution.minEatingSpeed(piles, 4));
    }
}
