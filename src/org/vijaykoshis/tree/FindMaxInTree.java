package org.vijaykoshis.tree;

public class FindMaxInTree {

    public static void main(String[] args) {

        FindMaxInTree tree = new FindMaxInTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(66);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        System.out.println("\n Find Max Element In BinaryTree::");
        int max = tree.FindMaxInBinaryTree(root);
        System.out.println("Max::" + max);


    }

    private int FindMaxInBinaryTree(Node root) {

        int max_val = Integer.MIN_VALUE;

        if (root != null) {

            int leftMax = FindMaxInBinaryTree(root.left);
            int rightMax = FindMaxInBinaryTree(root.right);
            System.out.println(leftMax + "\t" + rightMax);

            if (leftMax > rightMax) {
                max_val = leftMax;
            } else
                max_val = rightMax;
        }
        if (root.data > max_val) {
            max_val = root.data;
        }

        return max_val;
    }
}
