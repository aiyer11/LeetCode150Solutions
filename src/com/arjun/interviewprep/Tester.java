package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        PermutationStringSolution solution = new PermutationStringSolution();
        //int[] nums = {5,1,5,6,7,1,10};
        String s1 = "abc";
        String s2 ="lecaabee";

        System.out.println(solution.checkInclusion(s1,s2));
    }
}
