package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        TwoSumIISolution solution = new TwoSumIISolution();
        int[] nums = {1,2,3,4};
        int target = 3;
        System.out.println(Arrays.toString(solution.twoSumII(nums, target)));
    }
}
