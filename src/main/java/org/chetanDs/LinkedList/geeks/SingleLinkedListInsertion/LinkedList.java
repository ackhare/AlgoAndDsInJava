package org.chetanDs.LinkedList.geeks.SingleLinkedListInsertion;

public class LinkedList {
    Node head;  // head of list
    ;//As with all example it is taken to be the head of linked list

    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;//As with all example it is intialiased to null
        } // Constructor
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    /* Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(int key) {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {//we need to keep checking of null
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }
//so head is null at beginning and which ever new node will come
// it will add as head so it is like a stack

    //Every new node requires a data and another node to point which is next
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;////so that next time when above line(58) runs where the orignal
        // points should be pointed by this one
    }

    /* Function deletes the entire linked list */
    void deleteList() {
        head = null;
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();

//        llist.head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);

        /* Three nodes have been allocated  dynamically.
          We have refernces to these three blocks as first,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

        //llist.head.next = second; // Link first node with the second node

        /*  Now next of first Node refers to second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        //second.next = third; // Link second node with the third node

        /*  Now next of second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.printList();
        llist.deleteNode(1); // Delete node at position 4
        //llist.printList();
        llist.deleteList();

        System.out.println("Linked list deleted");
    }
}
