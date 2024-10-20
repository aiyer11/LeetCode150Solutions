package com.arjun.interviewprep.Trees;

public class MaxPathSumSolution {
    public int maxPathSum(TreeNode root) {
        int[] result = new int[]{root.val};
        dfs(root, result);
        return result[0];
    }

    private int dfs(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }

        int leftMax = Math.max(dfs(root.left,res),0);
        int rightMax = Math.max(dfs(root.right,res),0);

        res[0] = Math.max(res[0],root.val + leftMax + rightMax);

        return root.val + Math.max(leftMax,rightMax);
    }
}
