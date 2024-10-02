package com.arjun.interviewprep.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSolution {

    public String minWindow(String s, String t){
        HashMap<Character,Integer> tFreq = new HashMap<>();
        HashMap<Character,Integer> currentWindow = new HashMap<>();

        for(char c : t.toCharArray())
        {
            tFreq.put(c,tFreq.getOrDefault(c,0)+1);
        }

        int start =0;
        int have = 0;
        int length = s.length() + 1;
        int need = tFreq.size();
        String minWindow = "";

        for(int end = 0; end < s.length(); end++)
        {
            char currentChar = s.charAt(end);
            currentWindow.put(currentChar,currentWindow.getOrDefault(currentChar,0)+1);
            if(tFreq.containsKey(currentChar) && tFreq.get(currentChar) == currentWindow.get(currentChar))
            {
                have++;
            }

            while(have == need)
            {
                if(end-start+1 < length)
                {
                    length = end-start+1;
                    minWindow = s.substring(start,end+1);
                }
                char startChar = s.charAt(start);
                if(tFreq.containsKey(startChar) && tFreq.get(startChar) == currentWindow.get(startChar))
                {
                    have--;
                }
                currentWindow.put(startChar,currentWindow.get(startChar)-1);
                start++;
            }
        }
        return minWindow;
  }
}