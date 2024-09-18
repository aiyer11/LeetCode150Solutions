package com.arjun.interviewprep;

import java.util.HashMap;

public class LongestRepeatingSolution {

    public int characterReplacement(String s, int k){
        int start =0;
        int maxLength = 0;
        int maxFrequency = 0;
        HashMap<Character,Integer> characterCount = new HashMap<>();
        for(int end = 0; end < s.length();end++)
        {
            characterCount.put(s.charAt(end),characterCount.getOrDefault(s.charAt(end),0)+1);
            maxFrequency = Math.max(maxFrequency,characterCount.get(s.charAt(end)));
            if(end-start+1-maxFrequency > k)
            {
                characterCount.put(s.charAt(start),characterCount.get(s.charAt(start)) -1);
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }

}
