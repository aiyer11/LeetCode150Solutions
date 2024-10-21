package com.arjun.interviewprep.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeAndDeserializeTreeSolution {
    public String serialize(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfsSerialize(root, res);
        return String.join(",", res);
    }

    private void dfsSerialize(TreeNode root, List<String> res)
    {
        if(root == null)
        {
            res.add("n");
        }
        res.add(String.valueOf(root.val));
        dfsSerialize(root.left, res);
        dfsSerialize(root.right, res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodeValues = data.split(",");
        int[] counter = {0};
        return dfsDeserialize(nodeValues, counter);
    }

    private TreeNode dfsDeserialize(String[] nodeValues, int[] counter){
        if(nodeValues[counter[0]].equals("n"))
        {
            counter[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodeValues[counter[0]++]));
        root.left = dfsDeserialize(nodeValues, counter);
        root.right = dfsDeserialize(nodeValues, counter);
        return root;
    }
}
