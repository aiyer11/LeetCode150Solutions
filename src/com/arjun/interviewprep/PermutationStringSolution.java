package com.arjun.interviewprep;

import java.util.Arrays;

public class PermutationStringSolution {

    public boolean checkInclusion(String s1, String s2)
    {
        if(s2.length() < s1.length())
        {
            return false;
        }

        int start = 0;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(int i =0; i < s1.length(); i++)
        {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }

        int matches = 0;

        for(int i =0; i < 26; i++)
        {
            if(s1Freq[i] == s2Freq[i])
            {
                matches++;
            }
        }

        for(int end = s1.length(); end < s2.length(); end++)
        {
            if(matches == 26)
            {
                return true;
            }

            int index = s2.charAt(end) - 'a';
            s2Freq[index]++;
            if(s1Freq[index] == s2Freq[index])
            {
                matches++;
            }
            else if(s2Freq[index] == s1Freq[index] + 1)
            {
                matches--;
            }
            index = s2.charAt(start) - 'a';
            s2Freq[index]--;

            if(s1Freq[index] == s2Freq[index])
            {
                matches++;
            }
            else if(s1Freq[index] -1 == s2Freq[index])
            {
                matches--;
            }
            start++;
        }
        return matches == 26;
    }
}
