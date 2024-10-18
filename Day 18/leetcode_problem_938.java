// 938. Range Sum of BST.

public class leetcode_problem_938{
    public static void main(String [] args){

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
    public int rangeSumBST(TreeNode root, int low, int high) {
        // Integer sum = 0;
        int [] arr  = {0};
        inOrder(root,low,high,arr);
        return arr[0];
    }
    public static void inOrder(TreeNode root, int low, int high,int [] arr){
        if(root == null){
            return;
        }
        if(root.val <= high && root.val >= low){
            arr[0] += root.val;
        }
        inOrder(root.left,low,high,arr);
        inOrder(root.right,low,high,arr);
    }
}