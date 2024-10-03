package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.Search2DMatrixSolution;

public class Tester {
    public static void main(String[] args){

        Search2DMatrixSolution solution = new Search2DMatrixSolution();
        int[][] matrix = {{1,1}};
        System.out.println(solution.searchMatrix(matrix,2));
    }
}
