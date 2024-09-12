package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args){

        String[] strArr = {"we","say",":","yes","!@#$%^&*()"};
        List<String> arr = new ArrayList<String>(Arrays.stream(strArr).toList());
       EncodeAndDecodeSolution solution = new EncodeAndDecodeSolution();
       String decodeString = solution.encode(arr);
       System.out.println(decodeString);
       System.out.println(solution.decode(decodeString));
    }
}
