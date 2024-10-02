package com.arjun.interviewprep.Stack;

import java.util.Stack;

public class LargestRectangleSolution {

    public int largestRectangleArea(int[] heights){
        int maxArea = 0;
        Stack<int[]> rectangleStack = new Stack<>();

        for(int i = 0; i < heights.length; i++)
        {
            int start = i;
            while(!rectangleStack.isEmpty() && heights[i] < rectangleStack.peek()[1])
            {
                int[] rectangle = rectangleStack.pop();
                int height = rectangle[1];
                int width = i - rectangle[0];
                int area = height * width;
                if(area > maxArea){
                    maxArea = area;
                }
                start = rectangle[0];
            }
            rectangleStack.push(new int[]{start, heights[i]});
        }

        for(int[] pair: rectangleStack)
        {
            int index = pair[0];
            int height = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));
        }

        return maxArea;
    }
}
