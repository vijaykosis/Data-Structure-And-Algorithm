package org.vijaykoshis.CustomLinkListEx;

public class CircularLinkedList
{

    public int size = 0;
    public Node head = null;
    public Node tail = null;

    static class Node
    {

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }

    }

    private void insertNodeAtBegining(int val)
    {

        Node node = new Node(val);

        if (size == 0)
        {
            head = node;
            tail = head;
            node.next = head;
        }
        else
        {

            Node temp = head;
            node.next = temp;
            head = node;
            tail.next = head;

        }

        size++;
    }

    public void addNodeAtEnd(int data)
    {
        if (size == 0)
        {
            insertNodeAtBegining(data);
        }

        else
        {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            tail.next = head;
            size++;

        }

    }

    private void deleteNodeAtEnd()
    {
        if (head == null)
            return;

        Node node = head;
        while (node.next.next != head)
        {
            node = node.next;
        }
        node.next = head;
        tail = node;

    }

    private void deleteNodeAtStart()
    {
        if (size == 0)
        {
            System.out.println("\nList is Empty");
        }
        else
        {
            System.out.println("\ndeleting node " + head.data + " from start");
            head = head.next;
            tail.next = head;
            size--;
        }
    }

    private void displayAllNode()
    {
        System.out.print("Circular Linked List:\n");
        Node temp = head;
        if (size < 0)
        {
            System.out.print("List is empty");
        }
        else
        {
            do
            {
                System.out.println(" " + temp.data);
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Inser Node At Start");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertNodeAtBegining(10);

        cll.insertNodeAtBegining(20);
        cll.insertNodeAtBegining(30);
        cll.displayAllNode();

        System.out.println("insert Node at End");
        cll.addNodeAtEnd(40);
        cll.addNodeAtEnd(50);
        cll.displayAllNode();

        System.out.println("Delete Node at Start");

        cll.deleteNodeAtStart();
        cll.displayAllNode();

        System.out.println("Delete Node at End");

        cll.deleteNodeAtEnd();
        cll.displayAllNode();
    }
}
