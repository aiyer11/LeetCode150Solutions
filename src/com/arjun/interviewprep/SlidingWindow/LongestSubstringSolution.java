package com.arjun.interviewprep.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringSolution {
    public int lengthOfLongestSubstring(String s)
    {
        Set<Character> characters = new HashSet<>();
        int start =0;
        int maxLength =0;

        for(int end = 0; end < s.length(); end++)
        {
            while(characters.contains(s.charAt(end)))
            {
                characters.remove(s.charAt(start));
                start++;
            }
            characters.add(s.charAt(end));
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}
