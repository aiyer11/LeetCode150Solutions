package com.arjun.interviewprep;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesesSolution {

    public List<String> generateParenthesis(int n) {
        Stack<Character> stack = new Stack<>();
        List<String> res = new ArrayList<>();
        helper(0,0,n,stack,res);
        return res;
    }

    private void helper(int open, int close, int n,Stack<Character> stack, List<String> res)
    {
        if(open == close && close == n)
        {
            StringBuilder sb = new StringBuilder();
            for(Character c : stack)
            {
                sb.append(c);
            }
            res.add(sb.toString());
            return;
        }

        if(open < n)
        {
            stack.push('(');
            helper(open+1,close,n,stack,res);
            stack.pop();
        }

        if(close < open)
        {
            stack.push(')');
            helper(open,close+1,n,stack,res);
            stack.pop();
        }
    }
}
