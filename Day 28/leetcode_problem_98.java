// 98. Validate Binary Search Tree.

public class leetcode_problem_98{
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
    public boolean isValidBST(TreeNode root) {
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validate(TreeNode root,long min,long max){
        if(root == null) return true;
        if(root.val<= min || root.val >= max){
            return false;
        }
        // for left sub Tree
        boolean leftSubTree = validate(root.left,min,root.val);
        // for right sub Tree
        boolean rightSubTree = validate(root.right,root.val,max);
        return leftSubTree && rightSubTree;
    }
}