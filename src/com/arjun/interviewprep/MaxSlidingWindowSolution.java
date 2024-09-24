package com.arjun.interviewprep;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindowSolution {

    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int[] result = new int[nums.length - k +1];

        Deque<Integer> maxWindow = new ArrayDeque<>();

        int start = 0;
        int end = 0;

        while(end < nums.length)
        {
           while(!maxWindow.isEmpty() && nums[end] > nums[maxWindow.peekLast()])
           {
               maxWindow.pollLast();
           }
           maxWindow.offer(end);

           if(start > maxWindow.peekFirst())
           {
               maxWindow.pollFirst();
           }

            if(end - start + 1 == k)
            {
                result[start] = nums[maxWindow.peekFirst()];
                start++;
            }
            end++;
        }
        return result;
    }
}
