package org.vijaykoshis.tree;


/* Inorder Tree Traversal with Recursion
             1
          /    \
        2       3
      / \      /  \
    4    5    6    7



 Output:

4 2 5 1 6 3 7
*/


public class TreeTraversal {


    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.printf("%s ", root.data);

    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.printf("%s ", root.data);
        preOrder(root.left);

        preOrder(root.right);

    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.printf("%s ", root.data);
        inOrder(root.right);


    }


    public static void main(String args[]) {
        TreeTraversal tree = new TreeTraversal();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        System.out.println("InOrder Tree Traversal with Recursion");
        tree.inOrder(node);
        System.out.println("\n preOrder Tree Traversal with Recursion");

        tree.preOrder(node);

        System.out.println("\n postOrder Tree Traversal with Recursion");

        tree.postOrder(node);


    }

}






