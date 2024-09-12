package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeSolution {

    public String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("?").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str){
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
           int j = i;
           while(str.charAt(j) != '?'){
               j++;
           }
            int length = Integer.parseInt(str.substring(i,j));
            i = j + length + 1;
            list.add(str.substring(j+1,i));
        }
        return list;
    }
}
