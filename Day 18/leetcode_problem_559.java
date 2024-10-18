// 559. Maximum Depth of N-ary Tree.

public class leetcode_problem_559{
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
    public int maxDepth(Node root) {
        int count = 0;
        if(root == null){
            return count;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                Node node = queue.poll();
                for(Node child : node.children){
                    queue.offer(child);
                }
                size--;
            }
            count++;
        }
        return count;
    }
}