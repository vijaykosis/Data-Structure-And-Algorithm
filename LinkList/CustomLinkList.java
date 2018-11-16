package LinkListEx;

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

        Linklist.insertElementAtFront(1);
        System.out.println("insert Element At Front");
        Linklist.printList();

        System.out.println("================================"
                + "insert Element At Last");
        Linklist.insertElementAtEnd(50);
        Linklist.printList();

        System.out.println("================================"
                + "insert Element At Middle");
        Linklist.insertElementAtMiddle(100, 2);
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

    private void insertElementAtFront(int val)
    {

        /*If the Linked List is empty, then make the 
            new node as head */
        if (head == null)
        {
            head = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

    }

    private void insertElementAtEnd(int val)
    {

        Node new_node = new Node(val);

        /*If the Linked List is empty, then make the 
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

    public void insertElementAtMiddle(int val, int pos)
    {
        Node new_node = new Node(val);

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

}
