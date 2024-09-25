package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

      EvaluateRPNSolution solution = new EvaluateRPNSolution();
      String[] tokens = {"4","13","5","/","+"};
      System.out.println(solution.evalRPN(tokens));
    }
}
