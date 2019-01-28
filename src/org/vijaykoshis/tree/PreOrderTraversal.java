package org.vijaykoshis.tree;

import java.util.Stack;

public class PreOrderTraversal {

    public static void main(String args[]) {
        PreOrderTraversal tree = new PreOrderTraversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        tree.preorderIterative(root);
    }

    private void preorderIterative(Node root) {

        if (root == null) {

            return;
        }
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.peek();
            System.out.print(temp.data + "  ");
            stack.pop();
            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
}
