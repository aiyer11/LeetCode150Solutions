package com.arjun.interviewprep.Trees;

public class ValidBSTSolution {
    public boolean isValidBST(TreeNode root) {
        return validate(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }

    private boolean validate(TreeNode root,double left,double right)
    {
        if(root == null)
        {
            return true;
        }

        if(!(root.val > left && root.val < right))
        {
            return false;
        }
        return validate(root.left,left,root.val) && validate(root.right,root.val,right);
    }
}
