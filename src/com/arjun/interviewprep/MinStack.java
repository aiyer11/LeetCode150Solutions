package com.arjun.interviewprep;

import java.util.ArrayList;

public class MinStack
{
    private final ArrayList<Integer> stack;
    private final ArrayList<Integer> minVals;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minVals = new ArrayList<>();
    }

    public void push(int val) {
        if(stack.isEmpty())
        {
            minVals.add(0,val);
        }
        else
        {
            this.minVals.add(0,Math.min(val,this.minVals.get(0)));
        }
        stack.add(0,val);
    }

    public void pop() {
        this.stack.remove(0);
        this.minVals.remove(0);
    }

    public int top() {
        return stack.get(0);
    }

    public int getMin() {
        return minVals.get(0);
    }
}
