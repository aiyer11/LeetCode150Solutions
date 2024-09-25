package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

      MinStack minStack = new MinStack();
      minStack.push(1);
      minStack.push(2);
      minStack.push(0);
      System.out.println(minStack.getMin());
      minStack.pop();
      minStack.top();
      System.out.println(minStack.getMin());
    }
}
