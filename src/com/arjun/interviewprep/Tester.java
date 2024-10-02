package com.arjun.interviewprep;

import com.arjun.interviewprep.Stack.CarFleetSolution;
import com.arjun.interviewprep.Stack.LargestRectangleSolution;

public class Tester {
    public static void main(String[] args){

        LargestRectangleSolution solution = new LargestRectangleSolution();
        int[] heights = {7,1,7,2,2,4};
        System.out.println(solution.largestRectangleArea(heights));
    }
}
