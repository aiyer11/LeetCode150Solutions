package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        MinimumWindowSolution solution = new MinimumWindowSolution();
        //int[] nums = {5,1,5,6,7,1,10};
        String s1 = "OUZODYXAZV";
        String s2 ="XYZ";

        System.out.println(solution.minWindow(s1,s2));
    }
}
