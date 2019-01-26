package org.vijaykoshis.CustomLinkListEx;

public class UnrolledLinkedList
{
    Node head;
    Node second;
    Node third;

    static class Node
    {

        Node next;
        int num_elements;
        int array[];

        public Node(int num)
        {
            next = null;
            num_elements = 0;
            array = new int[num];
        }

    }

    public static void main(String[] args)
    {
        UnrolledLinkedList ull = new UnrolledLinkedList();
        ull.head = new Node(3);
        ull.head.num_elements = 3;
        ull.head.array[0] = 1;
        ull.head.array[1] = 2;
        ull.head.array[2] = 3;
        ull.second = new Node(3);

        ull.head.next = ull.second;

        ull.second.num_elements = 3;
        ull.second.array[0] = 4;
        ull.second.array[1] = 5;
        ull.second.array[2] = 6;

        ull.printprintUnrolledList();

    }

    private void printprintUnrolledList()
    {
        Node temp = head;
        while (temp != null)
        {
            for (int i = 0; i < temp.num_elements; i++)
                System.out.print(temp.array[i]);

            temp = temp.next;
        }

    }

}
