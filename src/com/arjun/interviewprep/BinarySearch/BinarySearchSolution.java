package com.arjun.interviewprep.BinarySearch;

public class BinarySearchSolution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int mid = nums.length/2;
        while(left >= 0  && left <= right)
        {
            if(target == nums[mid])
            {
                return mid;
            }

            if(target < nums[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }
}
