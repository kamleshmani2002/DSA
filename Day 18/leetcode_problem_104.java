// 104. Maximum Depth of Binary Tree

public class leetcode_problem_104{
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
    public int maxDepth(TreeNode root) {
        return BFS(root);
    }
    public static int BFS(TreeNode root){
        // ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                // queue.poll();
                size--;
            }
            count++;
        }
        return count;
    }
}