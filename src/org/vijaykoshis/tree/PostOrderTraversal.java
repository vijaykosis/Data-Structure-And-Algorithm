package org.vijaykoshis.tree;



/* PostOrder Tree Traversal without Recursion
             1
          /    \
        2       3
      / \      /  \
    4    5    6    7



 Output:

4 5 2  6 7 3 1
*/

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
    public static void main(String args[]) {

        PostOrderTraversal tree = new PostOrderTraversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        tree.postorderIterative(root);


    }

    public static void postorderIterative(Node root) {

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        if (root == null)
            return;

        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node temp = stack1.pop();

            stack2.push(temp);


            if (temp.left != null) {
                stack1.push(temp.left);
            }

            if (temp.right != null) {
                stack1.push(temp.right);
            }
        }
        while (!stack2.isEmpty()) {
            Node temp = stack2.pop();
            System.out.print(temp.data + "  ");
        }

    }
}
