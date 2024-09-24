package com.arjun.interviewprep;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesesSolution {

    public boolean isValid(String s){
        Stack<Character> stringStack = new Stack<>();
        HashMap<Character,Character> mappings = new HashMap<>();
        mappings.put(')','(');
        mappings.put(']','[');
        mappings.put('}','{');

        for(int i = 0; i < s.length(); i++)
        {
            if(!stringStack.isEmpty() && mappings.containsKey(s.charAt(i)) && stringStack.peek() == mappings.get(s.charAt(i)))
            {
                stringStack.pop();
            }
            else
            {
                stringStack.push(s.charAt(i));
            }
        }

        return stringStack.empty();
    }
}
