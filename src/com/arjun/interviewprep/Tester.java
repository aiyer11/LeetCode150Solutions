package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        MaxWaterContainerSolution solution = new MaxWaterContainerSolution();
        int[] nums = {1,7,2,5,4,7,3,6};
        System.out.println(solution.maxArea(nums));
    }
}
