package com.arjun.interviewprep.BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeMap {

    private HashMap<String, List<String[]>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key))
        {
            map.get(key).add(new String[]{value, Integer.toString(timestamp)});
        }
        else
        {
            List<String[]> list = new ArrayList<>();
            list.add(new String[]{value, Integer.toString(timestamp)});
            map.put(key, list);
        }
    }

    public String get(String key, int timestamp) {
        List<String[]> list = map.getOrDefault(key,new ArrayList<>());
        int left = 0;
        int right = list.size() - 1;
        String result = "";
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(Integer.parseInt(list.get(mid)[1]) <= timestamp)
            {
                result = list.get(mid)[0];
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return result;
    }
}
