package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        DailyTemperaturesSolution solution = new DailyTemperaturesSolution();
        int[] temperatures = {30,38,30,36,35,40,28};
        System.out.println(Arrays.toString(solution.dailyTemperatures(temperatures)));
    }
}
