// Top View of Binary Tree. problem Link --> (https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article)

public class GFG_problem_top_view{
    public static void main(String [] args){

    }
}

//{ Driver Code Starts
// Initial Template for JAVA

// import java.io.*;
// import java.util.*;
// import java.util.LinkedList;
// import java.util.Queue;


// } Driver Code Ends
// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    static class CustomNode{
        Node node;
        int col;
        CustomNode(Node node,int col){
            this.node = node;
            this.col = col;
        }
    }
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
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
            if(!map.containsKey(col)){
                map.put(col,node.data);
            }
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

// // { Driver Code Starts.

// class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data) {
//         this.data = data;
//         left = null;
//         right = null;
//     }
// }

// public class Tree {

//     static Node buildTree(String str) {

//         if (str.length() == 0 || str.charAt(0) == 'N') {
//             return null;
//         }

//         String ip[] = str.split(" ");
//         // Create the root of the tree
//         Node root = new Node(Integer.parseInt(ip[0]));
//         // Push the root to the queue

//         Queue<Node> queue = new LinkedList<>();

//         queue.add(root);
//         // Starting from the second element

//         int i = 1;
//         while (queue.size() > 0 && i < ip.length) {

//             // Get and remove the front of the queue
//             Node currNode = queue.peek();
//             queue.remove();

//             // Get the current node's value from the string
//             String currVal = ip[i];

//             // If the left child is not null
//             if (!currVal.equals("N")) {

//                 // Create the left child for the current node
//                 currNode.left = new Node(Integer.parseInt(currVal));
//                 // Push it to the queue
//                 queue.add(currNode.left);
//             }

//             // For the right child
//             i++;
//             if (i >= ip.length) break;

//             currVal = ip[i];

//             // If the right child is not null
//             if (!currVal.equals("N")) {

//                 // Create the right child for the current node
//                 currNode.right = new Node(Integer.parseInt(currVal));

//                 // Push it to the queue
//                 queue.add(currNode.right);
//             }
//             i++;
//         }

//         return root;
//     }

//     static void printInorder(Node root) {
//         if (root == null) return;

//         printInorder(root.left);
//         System.out.print(root.data + " ");

//         printInorder(root.right);
//     }

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int t = Integer.parseInt(br.readLine());

//         while (t > 0) {
//             String s = br.readLine();
//             Node root = buildTree(s);

//             Solution ob = new Solution();

//             ArrayList<Integer> vec = ob.topView(root);
//             for (int x : vec) System.out.print(x + " ");
//             System.out.println();

//             t--;
        
// System.out.println("~");
// }
//     }
// }
// // } Driver Code Ends