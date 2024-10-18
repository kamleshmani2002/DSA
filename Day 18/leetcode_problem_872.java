// 872. Leaf-Similar Trees.

public class leetcode_problem_872{
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        preOrder(root1,arr1);
        preOrder(root2,arr2);
        return arr1.equals(arr2);
    }
    public void preOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}