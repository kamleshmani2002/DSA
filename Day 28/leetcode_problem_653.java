// 653. Two Sum IV - Input is a BST.

public class leetcode_problem_653{
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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return twoPointer(list,k);
    }
    public void inOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    public boolean twoPointer(ArrayList<Integer> list,int k){
        int s = 0;
        int e = list.size()-1;
        while(s < e){
            int num = list.get(s)+list.get(e);
            if(num == k){
                return true;
            }else if(num > k){
                e--;
            }else{
                s++;
            }
        }
        return false;
    }
}