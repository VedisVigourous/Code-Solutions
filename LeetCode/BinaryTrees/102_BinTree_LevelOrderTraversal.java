/* Problem: 102 Binary Tree Level Order Traversal
   Link: https://leetcode.com/problems/binary-tree-level-order-traversal/
   Difficulty: Medium
   Language Used: Java*/

// Solution:
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()){
            int levelSize = qu.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i = 0 ; i < levelSize ; i++){
                TreeNode currentNode = qu.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    qu.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    qu.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}

/*
 * Author: Vadanta Kumar Chauhaan
 * LeetCode: https://leetcode.com/u/vedisvigourous/
 * GitHub: https://github.com/VedisVigourous
 * LinkedIn: https://www.linkedin.com/in/vadanta
 * Contact: vadanta592007@hotmail.com
 * Copyright (c) 2026 Vadanta Kumar Chauhaan. All rights reserved.
 */
