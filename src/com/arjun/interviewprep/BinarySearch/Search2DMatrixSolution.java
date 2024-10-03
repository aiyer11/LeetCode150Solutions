package com.arjun.interviewprep.BinarySearch;

public class Search2DMatrixSolution {

    public boolean searchMatrix(int[][] matrix, int target)
    {
        int top = 0;
        int bottom = matrix.length - 1;
        int row = 0;
        while(top <= bottom)
        {
            row = (top + bottom) / 2;
            if(target > matrix[row][matrix[0].length-1])
            {
                top = row + 1;
            }
            else if(target < matrix[row][0])
            {
                bottom = row - 1;
            }
            else
            {
                break;
            }
        }
        if(!(top <= bottom))
        {
            return false;
        }

        int left = 0;
        int right = matrix[0].length - 1;

        while(left <= right)
        {
            int middle = (left + right) / 2;
            if(target > matrix[row][middle])
            {
                left = middle + 1;
            }
            else if(target < matrix[row][middle])
            {
                right = middle - 1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
