package com.arjun.interviewprep.Trees;

public class LowestCommonAncestorSolution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;

        while(current != null) {
            if(p.val < current.val && q.val < current.val) {
                current = current.left;
            }
            else if(p.val > current.val && q.val > current.val) {
                current = current.right;
            }
            else{
                return current;
            }
        }
        return null;
    }
}
