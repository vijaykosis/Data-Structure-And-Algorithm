package org.vijaykoshis.CustomLinkListEx;

public class CustomDoublyLinkList
{

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev)
        {
            super();
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data)
        {
            super();
            this.data = data;
            next = null;
            prev = null;
        }

    }

    private void printDLinkList()
    {
        Node node = head;

        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }

    }

    private void inserNodeAtFront(int val)
    {

        Node new_node = new Node(val);

        new_node.next = head;
        new_node.prev = null;
        if (head != null)
        {
            head.prev = new_node;
        }

        head = new_node;
    }

    private void inserNodeAtEnd(int val)
    {

        Node node = head;

        Node new_node = new Node(val);

        /*  If the Linked List is empty, then make the new 
         * node as head */
        if (head == null)
        {
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (node.next != null)
        {
            node = node.next;
        }
        node.next = new_node;
        new_node.prev = node;
    }

    private void inserNodeAtMiddle(int val, int position)
    {

        Node node = head;

        Node new_node = new Node(val);

        if (head == null)
        {
            head = new_node;
            return;
        }

        int count = 1;

        while (node != null && count < position)
        {
            node = node.next;
            count++;
        }

        Node nodeAtpostion = node;
        new_node.next = node.next;
        node.next = new_node;
        new_node.prev = nodeAtpostion;

    }

    public static void main(String[] args)
    {
        CustomDoublyLinkList ddl = new CustomDoublyLinkList();

        System.out.println("Insert Node At Front");
        ddl.inserNodeAtFront(10);
        ddl.inserNodeAtFront(20);
        ddl.inserNodeAtFront(30);
        ddl.inserNodeAtFront(40);
        ddl.inserNodeAtFront(50);

        ddl.printDLinkList();

        System.out.println("Insert Node At End");

        ddl.inserNodeAtEnd(60);

        ddl.printDLinkList();

        System.out.println("Insert Node At End");

        ddl.inserNodeAtMiddle(70, 2);

        ddl.printDLinkList();

    }

}
