// 404. Sum of Left Leaves.

public class leetcode_problem_404{
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
    public int sumOfLeftLeaves(TreeNode root) {        
        int [] arr = {0};
        postOrder(root,arr);
        return arr[0];
    }
    public void postOrder(TreeNode root, int [] arr){
        // This condition null root.
        if(root == null){
            return;
        }
        // This condition for the were both tree Node are null.
        if(root.left == null && root.right == null){
            return;
        }
        // if right of root is not equlas null go to the right subtree.
        if(root.left == null && root.right != null){
            postOrder(root.right,arr);
            return;
        }
        // if left node is leaf of the tree
        if(root.left.left == null && root.left.right == null){
            arr[0] += root.left.val;
            // return;
        }
        else{
            postOrder(root.left,arr);
        }
        postOrder(root.right,arr);
    }
}