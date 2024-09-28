// Problem: Left View of a Binary Tree

// Description:
// Given a binary tree, return its left view. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side. If no left view is possible (i.e., the tree is empty), return an empty array.


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeLeftView {

    public static List<Integer> leftView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        findLeftView(root, answer, 0);


        return answer;  
    }

    public static void findLeftView(TreeNode root, List<Integer> answer, int levelOfTree) {
        if(root == null) return;

        if(answer.size() == levelOfTree) {
            answer.add(root.val);
        }

        findLeftView(root.left, answer, levelOfTree + 1);
        findLeftView(root.right, answer, levelOfTree + 1);
    }

    public static void main(String[] args) {
        // Test case 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);
        root1.left.left.right = new TreeNode(8);

        System.out.println(leftView(root1));  // Expected Output: [1, 2, 4, 8]

        // Test case 2
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(4);

        System.out.println(leftView(root2));  // Expected Output: [1, 3, 4]

        // Test case 3
        TreeNode root3 = null;
        System.out.println(leftView(root3));  // Expected Output: []
    }
}
