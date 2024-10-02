package com.arjun.interviewprep.ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsSolution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] charCount = new char[26];
            for(char c: str.toCharArray()){
                charCount[c-'a']++;
            }
            String key = new String(charCount);
            if(!anagrams.containsKey(key))
            {
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(str);
        }
        return new ArrayList<>(anagrams.values());
    }
}
