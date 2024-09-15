package com.arjun.interviewprep;

public class TwoSumIISolution {

    public int[] twoSumII(int[] nums, int target) {
        int[] result = new int[2];
        int i =0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            }
            else if(nums[i] + nums[j] > target){
                j--;
            }
            else{
                i++;
            }
        }

        return result;
    }
}
