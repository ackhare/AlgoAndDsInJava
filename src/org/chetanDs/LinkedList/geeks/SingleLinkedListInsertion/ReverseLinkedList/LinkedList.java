package org.chetanDs.LinkedList.geeks.SingleLinkedListInsertion.ReverseLinkedList;

// Java program for reversing the linked list

class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        //In any object before assigning its refrence store it in a temp or it will be lost
        while (current != null) {
            //It should be remembered the whole list is hold by node and that also node's next
            //so on first line we preserve the refrence in a temp variable
            next = current.next;
            current.next = prev;
            //It had three temp which needed to set for furtur iteration
            // .0so only the above two line are foir this iteration

            prev = current;
            current = next;
        }
        //what was hold by node will be hold be prev now
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //A knd of convention that head will hold the entire list and it is an easy thing as it
        //is a global type variable being accessed from everywhere
        //Most simple way to create a new linked list
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
 */
