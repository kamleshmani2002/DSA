import java.util.*;

class NAryTree{
    class NAryTreeNode{
        int data;
        List<NAryTreeNode> children;

        public NAryTreeNode(int data){
            this.data = data;
        }
    }

    public ArrayList<Integer> BFS(NAryTreeNode root){
        ArrayList<Integer> li = new ArrayList<Integer>();
        Queue<NAryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            NAryTreeNode node = queue.poll();
            li.add(node.data);
            for(NAryTreeNode child : node.children){
                queue.offer(child);
            }
        }
        return li;
    }
}

public class Example_02{
    public static void main(String [] args){

    }
}