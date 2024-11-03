// This is the basic implementaition of the Binary Search Tree.

import java.util.ArrayList;

// TreeNode Defination.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Binary Search Tree class implementaition.

class BST {
    // construction method.
    public static TreeNode constructTree(int [] arr){
        TreeNode root = null;
        for(int i : arr){
            root = insertIntoBST(root,i);
        }
        return root;
    }
    // node intertion method.
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertIntoBST(root.left,val);
        }else{
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
    // inOrder of the BST.
    public static void inOrder(ArrayList<Integer> list,TreeNode root){
        if(root == null){
            return;
        }
        inOrder(list,root.left);
        list.add(root.val);
        inOrder(list,root.right);
    } 
    // main method.
    public static void main(String [] arg){
        TreeNode root = constructTree(new int[]{4,5,23,56,35,7,2,16,10});
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(list,root);
        System.out.print(list);
    }
}

