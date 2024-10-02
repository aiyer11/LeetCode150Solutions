package com.arjun.interviewprep.TwoPointers;

public class MaxWaterContainerSolution {

    public int maxArea(int[] heights){
        int maxArea = 0;
        int left =0;
        int right = heights.length - 1;

        while(left < right){
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int currentArea = width * height;

            if(currentArea > maxArea){
                maxArea = currentArea;
            }

            if(heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
