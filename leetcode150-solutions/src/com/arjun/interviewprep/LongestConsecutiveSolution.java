package com.arjun.interviewprep;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSolution {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i =0; i < nums.length; i++)
        {
            numSet.add(nums[i]);
        }
        int maxSeq = 0;

        for(Integer n: numSet)
        {
            if(!numSet.contains(n-1))
            {
                int longestSeq = 1;
                while(numSet.contains(n+longestSeq)) {
                    longestSeq++;
                }
                maxSeq = Math.max(longestSeq,maxSeq);
            }
        }
        return maxSeq;
    }
}
