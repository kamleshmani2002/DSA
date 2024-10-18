// 144. Binary Tree Preorder Traversal.

public class leetcode_problem_144{
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        preOrder(root,list);
        return list;
    }
    public static void preOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}