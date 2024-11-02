// Bottom View of Binary Tree. problem Link --> (https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article)

public class GFG_problem_bottom_view{
    public static void main(String [] args){

    }
}

class Solution {
    class CustomNode{
        Node node;
        int col;
        CustomNode(Node node,int col){
            this.node = node;
            this.col = col;
        }
    }
    // Function to return a list of nodes visible from the bottom view
    // from left to right in Binary Tree.
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<CustomNode> queue = new LinkedList<>();
        queue.offer(new CustomNode(root,0));
        while(!queue.isEmpty()){
            CustomNode customNode = queue.poll();
            Node node = customNode.node;
            int col = customNode.col;
            // if(!map.containsKey(col)){
                map.put(col,node.data);
            // }
            if(node.left != null) queue.offer(new CustomNode(node.left,col-1));
            if(node.right != null) queue.offer(new CustomNode(node.right,col+1));
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        // map.clear();
        return list;
    }
}