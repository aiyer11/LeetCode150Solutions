package com.arjun.interviewprep.Trees;

import java.util.*;

public class LevelOrderTraversalSolution {

    public List<List<Integer>> levelOrderTraversal(TreeNode root){
        if(root == null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
