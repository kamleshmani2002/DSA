// 589. N-ary Tree Preorder Traversal.

public class leetcoe_prolblem_589{
    public static void main(String [] args){

    }
}

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        preOrder(root,list);
        return list;
    }
    public static void preOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        for(Node child : root.children){
            preOrder(child,list);
        }
    }
}