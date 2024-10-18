// 145. Binary Tree Postorder Traversal.

public class leetcode_problem_145{
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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        postOrder(root,list);
        return list;
    }
    public static void postOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }
}