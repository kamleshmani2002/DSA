// 101. Symmetric Tree.

public class leetcode_problem_101{
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
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        preOrder(root.left,list1);
        preRevOrder(root.right,list2);
        return list1.equals(list2);
    }

    public static void preOrder(TreeNode root ,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left == null){
            list.add(null);
        }else{
            preOrder(root.left,list);
        }
        if(root.right == null){
            list.add(null);
        }else{
            preOrder(root.right,list);
        }
    }

    public static void preRevOrder(TreeNode root ,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.right == null){
            list.add(null);
        }else{
            preRevOrder(root.right,list);
        }
        if(root.left == null){
            list.add(null);
        }else{
            preRevOrder(root.left,list);
        }
    }
}