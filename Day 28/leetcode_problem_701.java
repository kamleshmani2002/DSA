// 701. Insert into a Binary Search Tree.

public class leetcode_problem_701{
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode node = root;
        while(node != null){
            if(node.val > val){
                if(node.left == null){
                    node.left = new TreeNode(val);
                    return root;
                }
                node = node.left;
            }else{
                if(node.right == null){
                    node.right = new TreeNode(val);
                    return root;
                }
                node = node.right;
            }
        }
        return root;
    }
}