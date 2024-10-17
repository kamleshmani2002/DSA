import java.util.*;

class Tree{
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    // This function reutrn the levet order(BFS) of the Tree.
    public ArrayList<Integer>  BFS(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<Integer>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(ndoe.data);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
        return list;
    }
}

public class Example_01{
    public static void main(String [] args){

    }
}