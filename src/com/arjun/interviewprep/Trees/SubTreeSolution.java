package com.arjun.interviewprep.Trees;

public class SubTreeSolution {
    public boolean isSubtree(TreeNode root, TreeNode subTree) {
        if(root == null)
        {
            return false;
        }

        if(subTree == null)
        {
            return true;
        }

        if(isSameTree(root, subTree))
        {
            return true;
        }

        return isSubtree(root.left, subTree) || isSubtree(root.right, subTree);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
        {
            return true;
        }

        if(p != null && q != null && p.val == q.val)
        {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        else
        {
            return false;
        }
    }
}
