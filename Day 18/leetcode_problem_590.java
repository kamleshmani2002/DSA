// 590. N-ary Tree Postorder Traversal.

public class leetcod_problem_590{
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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    public static void postOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        for(Node child : root.children){
            postOrder(child,list);
        }
        list.add(root.val);
    }
}