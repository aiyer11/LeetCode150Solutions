package com.arjun.interviewprep.BinarySearch;

public class MinInRotatedArraySolution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[left] <= nums[right])
            {
                return nums[left];
            }

            if(nums[mid] >= nums[left])
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        return 0;
    }

}
