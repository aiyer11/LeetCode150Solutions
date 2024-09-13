package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        int[] arr = {1,2,2,3,3,3};
       TopKElementsSolution solution = new TopKElementsSolution();
       System.out.println(Arrays.toString(solution.topKFrequent(arr, 2)));
    }
}
