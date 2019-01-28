package org.vijaykoshis.tree;

import java.util.Stack;




/* Inorder Tree Traversal without Recursion
             1
          /    \
        2       3
      / \      /  \
    4    5    6    7



 Output:

4 2 5 1 6 3 7
*/


public class InOrderTraversal {

    public static void main(String args[]) {

        InOrderTraversal tree = new InOrderTraversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        tree.inOrder(root);


    }

    private void inOrder(Node root) {

        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();


        while (root != null || stack.size() > 0) {


            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            System.out.print(root.data + "  ");
            root = root.right;
        }

    }
}
