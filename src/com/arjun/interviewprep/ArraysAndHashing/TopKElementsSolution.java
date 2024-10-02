package com.arjun.interviewprep.ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElementsSolution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int[] result = new int[k];
        for(int n: nums){
            count.put(n,count.getOrDefault(n,0) + 1);
        }
        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k; i--){
           for(int n: freq[i]){
               result[index++] = n;
           }
           if(index == k)
           {
               return result;
           }
        }
        return result;
    }

}
