package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        MaxSlidingWindowSolution solution = new MaxSlidingWindowSolution();
        int[] nums = {1,2,1,0,4,2,6};
        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums, 3)));
    }
}
