// Problem: Nodes at Distance K from Root

// Description:
// Given a binary tree and an integer k, print all nodes that are at distance k from the root. The root node is considered to be at distance 0 from itself. The nodes should be printed from left to right.

// Input:
// - An integer k (distance from the root)
// - A binary tree represented by its root node.

// Output:
// - A list of integers representing the nodes that are at distance k from the root.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class KDistanceNodes {

    public static List<Integer> Kdistance(TreeNode root, int k) {
        List<Integer> kDistanceNodes = new ArrayList<>();
        if (root == null) return kDistanceNodes;  
    
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); 
    
        int currentLevel = 0;
    
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
    
            if (currentNode != null) {
                if (currentLevel == k) {
                    kDistanceNodes.add(currentNode.val);
                }
    
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            } else {
                currentLevel++;
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
        }
        return kDistanceNodes;  
    }
    

    public static void main(String[] args) {
        // Test case 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);

        int k1 = 0;
        System.out.println(Kdistance(root1, k1));  // Expected Output: [1]

        // Test case 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.right = new TreeNode(1);
        root2.left.right.left = new TreeNode(5);
        root2.left.right.right = new TreeNode(3);

        int k2 = 3;
        System.out.println(Kdistance(root2, k2));  // Expected Output: [5, 3]
    }
}
