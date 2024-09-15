package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        ThreeSumSolution solution = new ThreeSumSolution();
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(solution.threeSum(nums));
    }
}
