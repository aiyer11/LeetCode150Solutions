package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        TrappingRainWaterSolution solution = new TrappingRainWaterSolution();
        int[] nums = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(solution.trap(nums));
    }
}
