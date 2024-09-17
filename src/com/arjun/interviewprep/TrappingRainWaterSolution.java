package com.arjun.interviewprep;

public class TrappingRainWaterSolution {
    public int trap(int[] height) {
        int waterCount = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];

        while(left < right){
            if(maxLeft < maxRight)
            {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                waterCount += maxLeft - height[left];
            }
            else
            {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                waterCount += maxRight - height[right];
            }
        }
        return waterCount;
    }
}
