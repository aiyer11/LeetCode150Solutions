package com.arjun.interviewprep.Trees;

public class InvertTreeSolution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
