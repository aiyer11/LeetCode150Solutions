package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int k = 0; k < nums.length; k++)
        {
            if(k > 0 && nums[k] == nums[k - 1])
            {
                continue;
            }
            int target = -nums[k];
            int i = k+1, j = nums.length - 1;
            while(i < j)
            {
                if(nums[i] + nums[j] > target)
                {
                    j--;
                }
                else if(nums[i] + nums[j] < target)
                {
                    i++;
                }
                else
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    i++;
                    j--;
                    while(i < j && nums[i] == nums[i-1])
                    {
                        i++;
                    }
                }
            }
        }
        return result;
    }
}
