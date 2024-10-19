// 222. Count Complete Tree Nodes.

public class leetcode_problem_222{
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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int [] arr = {0};
        inOrder(root,arr);
        return arr[0];
    }
    public static void inOrder(TreeNode root,int [] arr){
        if(root == null){
            return;
        }
        inOrder(root.left,arr);
        arr[0] += 1;
        inOrder(root.right,arr);
    }
}