// 110. Balanced Binary Tree.

public class leetcode_problem_110{
    public static void mani(String [] args){

    }
}

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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        Boolean [] flag = {true};
        Height(root,flag);
        return flag[0];
    }
    public static int Height(TreeNode root,Boolean [] flag){
        if(root == null){
            return 0;
        }
        int leftHeight = Height(root.left,flag);
        int rightHeight = Height(root.right,flag);
        int val = Math.abs(leftHeight-rightHeight);
        if(val > 1){
            flag[0] = false;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}