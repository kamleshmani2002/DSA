public class leetcode_problem_173{
    public static void main(String [] args){

    }
}

// Solution using the stack 
// int this solution Runtime complexity is same but the Space complexity is different.
// Space complexity --> O(h) --> in the worst case will be O(n) but in this case height also will be O(n).

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
class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
    
    public int next() {
        TreeNode node = stack.pop();
        int val = node.val;
        node = node.right;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
        return val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */


// Solution using the list 
// Runtime complexity --> O(n)
// Space complexity --> O(n)

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
class BSTIterator {
    ArrayList<Integer> list = new ArrayList<>();
    int index = 0;
    public BSTIterator(TreeNode root) {
        inOrder(root,list);
    }
    
    public int next() {
        if(index < list.size()){
            return list.get(index++);
        }
        return -1;
    }
    
    public boolean hasNext() {
        return index != list.size();
    }
    public void inOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */