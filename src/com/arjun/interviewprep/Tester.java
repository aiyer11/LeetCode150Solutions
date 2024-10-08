package com.arjun.interviewprep;

import com.arjun.interviewprep.BinarySearch.SearchInRotatedArraySolution;
import com.arjun.interviewprep.BinarySearch.TimeMap;

public class Tester {
    public static void main(String[] args){
        TimeMap timeMap = new TimeMap();
        timeMap.set("check", "one", 5);
        timeMap.set("check", "two", 10);
        System.out.println(timeMap.get("check", 7));
        System.out.println(timeMap.get("nonexistent", 7));
    }
}
