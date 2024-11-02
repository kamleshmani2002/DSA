// Tree Boundary Traversal. problem Link ---> (https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1)
public class GFG_boundry_problem{
    public static void main(String [] args){

    }
}

class Solution {
    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Add the root node if it's not a leaf
        if (!isLeaf(node)) {
            list.add(node.data);
        }

        // Add the left boundary (excluding leaf nodes)
        leftMove(list, node.left);

        // Add all leaf nodes (both from left and right subtrees)
        leafNode(list, node);

        // Add the right boundary (excluding leaf nodes, in reverse order)
        rightMove(list, node.right);

        return list;
    }

    void leftMove(ArrayList<Integer> list, Node root) {
        Node leftNode = root;
        while (leftNode != null) {
            if (isLeaf(leftNode)) {
                break;
            }
            list.add(leftNode.data);
            if (leftNode.left != null) {
                leftNode = leftNode.left;
            } else {
                leftNode = leftNode.right;
            }
        }
    }

    void rightMove(ArrayList<Integer> list, Node root) {
        Node rightNode = root;
        Stack<Integer> stack = new Stack<>();
        while (rightNode != null) {
            if (isLeaf(rightNode)) {
                break;
            }
            stack.push(rightNode.data);
            if (rightNode.right != null) {
                rightNode = rightNode.right;
            } else {
                rightNode = rightNode.left;
            }
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }

    boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    void leafNode(ArrayList<Integer> list, Node root) {
        if (root == null) {
            return;
        }
        if (isLeaf(root)) {
            list.add(root.data);
        }
        leafNode(list, root.left);
        leafNode(list, root.right);
    }
}