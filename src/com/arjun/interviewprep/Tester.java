package com.arjun.interviewprep;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args){


       ProductExceptSelfSolution solution = new ProductExceptSelfSolution();
       int[] nums = {1,2,4,6};
       System.out.println(Arrays.toString(solution.productExceptSelf(nums)));
    }
}
