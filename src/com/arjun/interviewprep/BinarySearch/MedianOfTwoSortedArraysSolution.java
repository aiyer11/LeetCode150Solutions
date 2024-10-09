package com.arjun.interviewprep.BinarySearch;

public class MedianOfTwoSortedArraysSolution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] A = nums1;
        int[] B = nums2;

        if(B.length < A.length)
        {
            int[] temp = A;
            A = B;
            B = temp;
        }
        int half = (A.length + B.length + 1)/2;

        int left = 0;
        int right = A.length;

        while(left <= right)
        {
            int middle = (left + right) / 2;
            int j = half - middle;

            int Aleft = middle > 0 ? A[middle -1] : Integer.MIN_VALUE;
            int Aright = middle < A.length ? A[middle]: Integer.MAX_VALUE;
            int Bleft = j > 0 ? B[j - 1] : Integer.MIN_VALUE;
            int Bright = j < B.length ? B[j] : Integer.MAX_VALUE;

            if(Aleft <= Bright && Bleft <= Aright)
            {
                return (A.length + B.length) % 2 == 0 ? (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0 : Math.max(Aleft, Bleft);
            }
            else if(Aleft > Bright)
            {
                right = middle - 1;
            }
            else
            {
                left = middle + 1;
            }
        }
        return 0;
    }
}
