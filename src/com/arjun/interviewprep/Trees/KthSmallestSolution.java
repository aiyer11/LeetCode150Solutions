package com.arjun.interviewprep.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KthSmallestSolution {

    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        int counter = 0;
        while(cur != null || !stack.isEmpty())
        {
            while(cur != null)
            {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            counter++;
            if(counter == k)
            {
                return cur.val;
            }
            cur = cur.right;
        }
        return -1;
    }
}
