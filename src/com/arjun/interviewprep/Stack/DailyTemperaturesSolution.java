package com.arjun.interviewprep.Stack;

import java.util.Stack;

public class DailyTemperaturesSolution {

    public int[] dailyTemperatures(int[] temperatures){
        Stack<int[]> tempStack = new Stack<>();
        int[] results = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++)
        {
           while(!tempStack.isEmpty() && temperatures[i] > tempStack.peek()[0])
           {
               int[] res = tempStack.pop();
               results[res[1]] = i - res[1];
           }
           tempStack.push(new int[]{temperatures[i],i});
        }
        return results;

    }
}
