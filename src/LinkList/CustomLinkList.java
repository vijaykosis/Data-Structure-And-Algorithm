package LinkList;

public class CustomLinkList
{
    Node head;

    static class Node
    {

        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        CustomLinkList Linklist = new CustomLinkList();
        Linklist.head = new Node(5);
        Node secound = new Node(10);
        Node third = new Node(20);
        Node forth = new Node(30);
        Linklist.head.next = secound;
        secound.next = third;
        third.next = forth;

        Linklist.printList();

        Linklist.insertNodeAtFront(1);
        System.out.println("insert Node At Front");
        Linklist.printList();

        System.out.println("================================"
                + "insert Node At Last");
        Linklist.insertNodeAtEnd(50);
        Linklist.printList();

        System.out.println("================================"
                + "insert Node At Middle");
        Linklist.insertNodeAtMiddle(100, 2);
        Linklist.printList();

        System.out.println("================================"
                + "Delete Node At First");
        Linklist.deleteNodeAtStart();

        Linklist.printList();
        System.out.println("================================"
                + "Delete Node At End");

        Linklist.deleteNodeAtEnd();
        Linklist.printList();

        System.out.println("================================"
                + "Delete Node At given postion");

        Linklist.deleteNodeAtPosition(2);
        Linklist.printList();

        System.out.println("================================"
                + "Delete Node At Matched postion");

        Linklist.deleteNodeAtMatchedPos(20);
        Linklist.printList();
    }

    private void printList()
    {
        Node node = head;
        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }

    }

    private void printList(Node p)
    {
        Node node = p;
        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }

    }

    private void insertNodeAtFront(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

    }

    private void insertNodeAtEnd(int val)
    {

        Node new_node = new Node(val);

        /* If the Linked List is empty, then make the 
            new node as head */
        if (head == null)
        {
            head = new Node(val);
            return;
        }

        Node last = head;

        while (last.next != null)
        {

            last = last.next;
        }

        last.next = new_node;

    }

    private void insertNodeAtMiddle(int val, int pos)
    {
        Node new_node = new Node(val);

        /*If the Linked List is empty, then make the 
            new node as head */
        if (head == null)
        {
            head = new Node(val);
            return;
        }

        Node middle = head;
        int count = 0;

        while (count < pos - 1 && middle.next != null)
        {
            middle = middle.next;
            count++;
        }

        Node nodeAtPostion = middle.next;
        middle.next = new_node;
        middle = middle.next;
        new_node.next = nodeAtPostion;

    }

    public void deleteNodeAtLast()
    {
        if (head == null)
            return;
        Node p = head, q = null, next = head.next;

        while ((next = p.next) != null)
        {
            q = p;
            p = next;
        }
        q.next = null;

        printList(head);

    }

    private void deleteNodeAtEnd()
    {
        if (head == null)
            return;

        Node temp = head;

        while (temp.next.next != null)
        {
            temp = temp.next;
        }

        temp.next = null;

    }

    private void deleteNodeAtPosition(int position)
    {
        if (head == null)
            return;

        // Store head node 
        Node temp = head;

        // If head needs to be removed 
        if (position == 0)
        {
            head = temp.next; // Change head 
            return;
        }

        for (int i = 1; i < position; i++)
        {
            temp = temp.next;
        }

        temp.next = temp.next.next;

    }

    private void deleteNodeAtMatchedPos(int key)
    {
        if (head == null)
            return;

        // Store head node 
        Node temp = head;
        Node prev = null;

        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head 
            return;
        }

        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }

    private void deleteNodeAtStart()
    {
        if (head == null)
        {
            return;
        }

        Node node = head.next;
        head = node;
    }

}
