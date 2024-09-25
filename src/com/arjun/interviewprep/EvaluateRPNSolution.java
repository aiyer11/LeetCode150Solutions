package com.arjun.interviewprep;

import java.util.Stack;

public class EvaluateRPNSolution {

    public int evalRPN(String[] tokens)
    {
        Stack<String> tokenStack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "*": {
                    int a = Integer.parseInt(tokenStack.pop());
                    int b = Integer.parseInt(tokenStack.pop());
                    tokenStack.push(String.valueOf(a*b));
                    continue;
                }
                case "+": {
                    int a = Integer.parseInt(tokenStack.pop());
                    int b = Integer.parseInt(tokenStack.pop());
                    tokenStack.push(String.valueOf(a+b));
                    continue;
                }
                case "-": {
                    int a = Integer.parseInt(tokenStack.pop());
                    int b = Integer.parseInt(tokenStack.pop());
                    tokenStack.push(String.valueOf(b - a));
                    continue;
                }
                case "/": {
                    int a = Integer.parseInt(tokenStack.pop());
                    int b = Integer.parseInt(tokenStack.pop());
                    tokenStack.push(String.valueOf( b /a));
                    break;
                }
                default:
                    tokenStack.push(token);
                    break;
            }

        }
        return Integer.parseInt(tokenStack.pop());

    }
}
