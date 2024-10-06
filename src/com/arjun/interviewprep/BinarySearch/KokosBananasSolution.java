package com.arjun.interviewprep.BinarySearch;

import java.util.Arrays;
import java.util.Collections;

public class KokosBananasSolution {

    public int minEatingSpeed(int[] piles, int h)
    {
        int maxOfPiles = Arrays.stream(piles).max().getAsInt();

        int left = 1;
        int right = maxOfPiles;
        int minK = 0;
        while(left <= right)
        {
            int k = (left + right) / 2;
            int hours = 0;
            for(int i = 0; i < piles.length; i++)
            {
                hours += Math.ceil((double)piles[i]/k);
            }

            if(hours <= h)
            {
                minK = k;
                right = k - 1;
            }

            if(hours > h)
            {
                left = k + 1;
            }
        }
        return minK;
    }
}
