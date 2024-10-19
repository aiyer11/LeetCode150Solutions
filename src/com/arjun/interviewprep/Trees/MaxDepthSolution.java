package com.arjun.interviewprep.Trees;

public class MaxDepthSolution {
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;

        if(root == null)
        {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
